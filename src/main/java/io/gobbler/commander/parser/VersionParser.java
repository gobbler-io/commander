package io.gobbler.commander.parser;

import java.util.function.Predicate;

import static io.gobbler.commander.parser.Keywords.VERSION;

public class VersionParser extends Parser {

    @Override
    public void handle(ObjectNode node, ParserContext context) {
        System.out.println("Version: " + node.get(String.class));
    }

    @Override
    public Predicate<ObjectNode> getPredicate() {
        return super.getPredicate()
                .and(value -> VERSION.match(value.key()));
    }

}

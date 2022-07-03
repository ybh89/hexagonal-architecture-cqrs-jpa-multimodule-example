package attributefilter.command.keyword;

import java.util.Objects;

public class KeywordId {
    private Long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeywordId keywordId = (KeywordId) o;
        return Objects.equals(id, keywordId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

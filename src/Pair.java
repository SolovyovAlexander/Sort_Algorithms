class Pair {
    String code;
    boolean is_it_char;

    Pair(String new_key, boolean new_value) {
        code = new_key;
        is_it_char = new_value;
    }

    String get_code() {
        return code;
    }

    boolean isLetter() {
        return is_it_char;
    }

    public int compareTo(Pair pair) {

        if (!isLetter() && !pair.isLetter()) {
            return Integer.valueOf(code).compareTo(Integer.valueOf(pair.code));
        } else {
            return code.compareTo(pair.code);
        }
    }

}

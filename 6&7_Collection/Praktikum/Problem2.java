public static void main(String[] args) {
    System.out.println(ArrayMerge(
            List.of("kazuya", "jin", "lee"),
            List.of("kazuya", "feng")));
}

static List<String> ArrayMerge(List<String> arrayA, List<String> arrayB) {

    HashSet<String> mapper = new HashSet<>();

    for (var arrA : arrayA) {
        mapper.add(arrA);
    }

    for (var arrB : arrayB) {
        mapper.add(arrB);
    }

    List<String> result = new ArrayList<>(mapper);
    return result;
}
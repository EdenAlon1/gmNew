package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duzt extends duzv {
    private duzt(emxc emxcVar, duzw duzwVar) {
        super(emxcVar, duzwVar);
    }

    public static duzt b() {
        duzt duztVar = new duzt(emux.a, duzw.a);
        super.c("");
        return duztVar;
    }

    @Override // defpackage.duzv
    public final /* bridge */ /* synthetic */ Object a(final String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Item is empty");
        }
        if (str.charAt(str.length() - 1) != '*') {
            return new emxg() { // from class: duzs
                @Override // defpackage.emxg
                public final boolean a(Object obj) {
                    return ((String) obj).equals(str);
                }
            };
        }
        final String substring = str.substring(0, str.length() - 1);
        return new emxg() { // from class: duzr
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((String) obj).startsWith(substring);
            }
        };
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjuy implements fbba {
    public static ejis a() {
        eyhs eyhsVar;
        int i;
        ejio ejioVar = new ejio();
        ejioVar.d = (byte) (ejioVar.d | 2);
        ejioVar.a(1000000);
        ejioVar.c = -1L;
        ejioVar.d = (byte) (ejioVar.d | 4);
        ejioVar.e = 2;
        cjwc cjwcVar = cjwc.a;
        if (cjwcVar == null) {
            throw new NullPointerException("Null valueDefaultInstance");
        }
        ejioVar.a = cjwcVar;
        ejioVar.a(2000000);
        if (ejioVar.d == 7 && (eyhsVar = ejioVar.a) != null && (i = ejioVar.e) != 0) {
            ejip ejipVar = new ejip(eyhsVar, ejioVar.b, ejioVar.c, i);
            emxf.m(ejipVar.b > 0, "The maximum cache size must be limited by memory or entry count as a positive integer");
            return ejipVar;
        }
        StringBuilder sb = new StringBuilder();
        if (ejioVar.a == null) {
            sb.append(" valueDefaultInstance");
        }
        if ((ejioVar.d & 1) == 0) {
            sb.append(" maxSizeBytes");
        }
        if ((2 & ejioVar.d) == 0) {
            sb.append(" maxEntryCount");
        }
        if ((ejioVar.d & 4) == 0) {
            sb.append(" filterAfterWriteMs");
        }
        if (ejioVar.e == 0) {
            sb.append(" storage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}

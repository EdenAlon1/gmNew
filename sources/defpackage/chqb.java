package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class chqb {
    public static escu a(int i) {
        escs escsVar = (escs) escu.a.createBuilder();
        if (i == -2) {
            escsVar.copyOnWrite();
            ((escu) escsVar.instance).b = esct.a(3);
        } else if (i == -1) {
            escsVar.copyOnWrite();
            ((escu) escsVar.instance).b = esct.a(2);
        } else if (i < 0) {
            escsVar.copyOnWrite();
            ((escu) escsVar.instance).b = esct.a(2);
        } else {
            escsVar.copyOnWrite();
            ((escu) escsVar.instance).b = esct.a(4);
            escsVar.copyOnWrite();
            ((escu) escsVar.instance).c = i;
        }
        return (escu) escsVar.build();
    }

    public static String b(int i) {
        return String.format("#%06X", Integer.valueOf(i & 16777215));
    }
}

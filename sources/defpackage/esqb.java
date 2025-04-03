package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class esqb extends Exception {
    public final espw a;
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esqb(String str, espw espwVar, int i, Throwable th) {
        super(str + ", " + espwVar, th);
        espwVar.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = espwVar;
        this.b = i;
    }

    public /* synthetic */ esqb(String str, Throwable th, int i) {
        this(str, (i & 2) != 0 ? espw.a : null, (i & 4) != 0 ? 4 : 0, (i & 8) != 0 ? null : th);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public esqb(String str, espw espwVar, Throwable th) {
        this(str, espwVar, 4, th);
        str.getClass();
    }

    public esqb(String str, Throwable th) {
        this(str, espw.a, 4, th);
    }
}

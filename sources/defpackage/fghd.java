package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fghd {
    private final ffqn a = new ffqn(new fghg(8, false), ffqo.a);

    public final int a() {
        long j = ((fghg) this.a.a).b.c;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object b() {
        while (true) {
            fghg fghgVar = (fghg) this.a.a;
            Object b = fghgVar.b();
            if (b != fghg.a) {
                return b;
            }
            this.a.d(fghgVar, fghgVar.c());
        }
    }

    public final void c() {
        while (true) {
            fghg fghgVar = (fghg) this.a.a;
            if (fghgVar.d()) {
                return;
            } else {
                this.a.d(fghgVar, fghgVar.c());
            }
        }
    }

    public final boolean d(Object obj) {
        while (true) {
            fghg fghgVar = (fghg) this.a.a;
            int a = fghgVar.a(obj);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return false;
            }
            this.a.d(fghgVar, fghgVar.c());
        }
    }
}

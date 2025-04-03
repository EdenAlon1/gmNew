package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffqt implements ffrd {
    private final ffqs[] a;

    public ffqt(ffqs[] ffqsVarArr) {
        this.a = ffqsVarArr;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ffqs[] ffqsVarArr = this.a;
            if (i >= ffqsVarArr.length) {
                return;
            }
            ffte ffteVar = ffqsVarArr[i].a;
            if (ffteVar == null) {
                ffkj.c("handle");
                ffteVar = null;
            }
            ffteVar.hO();
            i++;
        }
    }

    @Override // defpackage.ffrd
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + "]";
    }
}

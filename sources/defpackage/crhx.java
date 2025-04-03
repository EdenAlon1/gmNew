package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class crhx extends vk {
    private final ekyo e;
    public bfkf d = null;
    public boolean a = false;

    public crhx(ekyo ekyoVar) {
        this.e = ekyoVar;
    }

    @Override // defpackage.vk
    public final int a() {
        bfkf bfkfVar;
        elav a = this.e.a("RecyclerViewCursorAdapter#getItemCount");
        try {
            int i = 0;
            if (this.a && (bfkfVar = this.d) != null && !bfkfVar.isClosed()) {
                i = this.d.getCount();
            }
            a.close();
            return i;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

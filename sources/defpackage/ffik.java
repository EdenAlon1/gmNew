package defpackage;

import java.io.File;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffik extends ffcz {
    final /* synthetic */ ffim a;
    private final ArrayDeque b;

    public ffik(ffim ffimVar) {
        this.a = ffimVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.b = arrayDeque;
        if (ffimVar.a.isDirectory()) {
            arrayDeque.push(new ffii(ffimVar.a));
        } else if (ffimVar.a.isFile()) {
            arrayDeque.push(new ffij(ffimVar.a));
        } else {
            b();
        }
    }

    @Override // defpackage.ffcz
    protected final void a() {
        File file;
        File a;
        while (true) {
            ffil ffilVar = (ffil) this.b.peek();
            if (ffilVar == null) {
                file = null;
                break;
            }
            a = ffilVar.a();
            if (a == null) {
                this.b.pop();
            } else if (ffkj.e(a, ffilVar.a) || !a.isDirectory() || this.b.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                this.b.push(new ffii(a));
            }
        }
        file = a;
        if (file != null) {
            c(file);
        } else {
            b();
        }
    }
}

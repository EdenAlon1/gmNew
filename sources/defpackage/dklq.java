package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dklq {
    public final /* synthetic */ dkls a;

    public dklq(dkls dklsVar) {
        this.a = dklsVar;
    }

    public final void a(int i, String str) {
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            ((dklu) it.next()).a(i, str);
        }
    }
}

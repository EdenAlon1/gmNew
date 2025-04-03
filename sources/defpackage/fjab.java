package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fjab extends fizg {
    private static final long serialVersionUID = -4319510507246305931L;
    protected List a;

    protected fjab() {
    }

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append(h((byte[]) it.next(), true));
            if (it.hasNext()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = new ArrayList(2);
        while (fixbVar.d() > 0) {
            this.a.add(fixbVar.j());
        }
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            fixdVar.c((byte[]) it.next());
        }
    }
}

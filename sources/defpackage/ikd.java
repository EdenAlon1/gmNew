package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikd {
    public final cno a;
    public final ikx b;
    public boolean c;

    public ikd(cno cnoVar, ikx ikxVar) {
        this.a = cnoVar;
        this.b = ikxVar;
    }

    public final boolean a(long j) {
        Object obj;
        List list = this.b.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (ikt.b(((ikz) obj).a, j)) {
                break;
            }
            i++;
        }
        ikz ikzVar = (ikz) obj;
        if (ikzVar != null) {
            return ikzVar.h;
        }
        return false;
    }
}

package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfs {
    public final jjn a;
    public final cnx b;

    public jfs(jjw jjwVar, cmy cmyVar) {
        this.a = jjwVar.c;
        this.b = new cnx(jjwVar.i().size());
        List i = jjwVar.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            jjw jjwVar2 = (jjw) i.get(i2);
            if (cmyVar.b(jjwVar2.e)) {
                this.b.e(jjwVar2.e);
            }
        }
    }
}

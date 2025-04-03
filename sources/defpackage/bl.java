package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bl {
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList e = new ArrayList();

    public bl(bh bhVar) {
        this.a = bhVar.w;
        this.b = bhVar.x;
        this.c = bhVar.h();
        this.d = bhVar.d();
        ArrayList arrayList = bhVar.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new bk((bg) arrayList.get(i)));
        }
    }
}

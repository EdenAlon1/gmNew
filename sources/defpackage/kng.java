package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kng {
    public ArrayList a = new ArrayList();
    public int b = 1;
    public ArrayList c = new ArrayList();
    public int d = 8388613;
    public int e = -1;
    public int f = 80;

    public final /* bridge */ /* synthetic */ Object clone() {
        kng kngVar = new kng();
        kngVar.a = new ArrayList(this.a);
        kngVar.b = this.b;
        kngVar.c = new ArrayList(this.c);
        kngVar.d = this.d;
        kngVar.e = this.e;
        kngVar.f = this.f;
        return kngVar;
    }
}

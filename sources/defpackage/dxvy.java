package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvy extends dxwd {
    public Uri a;
    public String b;
    public dxba c;
    public emxc d;
    public int e;
    public engw f;
    public int g;
    public String h;
    public final emxc i;
    public final emxc j;
    public boolean k;
    public eydq l;
    public byte m;

    public dxvy() {
        emux emuxVar = emux.a;
        this.d = emuxVar;
        this.i = emuxVar;
        this.j = emuxVar;
    }

    @Override // defpackage.dxwd
    public final void a(int i) {
        this.g = i;
        this.m = (byte) (this.m | 2);
    }

    @Override // defpackage.dxwd
    public final void b(boolean z) {
        this.k = z;
        this.m = (byte) (this.m | 4);
    }
}

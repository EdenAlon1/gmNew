package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class empz extends emqz {
    public enhd a;
    public enhk b;
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();
    public Optional f = Optional.empty();
    private boolean g;
    private byte h;

    @Override // defpackage.emqz
    public final emra a() {
        enhd enhdVar = this.a;
        if (enhdVar != null) {
            this.b = enhdVar.c();
        } else if (this.b == null) {
            this.b = enoz.a;
        }
        if (this.h == 1) {
            return new emqa(this.g, this.b, this.c, this.d, this.e, this.f);
        }
        throw new IllegalStateException("Missing required properties: isMatch");
    }

    @Override // defpackage.emqz
    public final void b(boolean z) {
        this.g = z;
        this.h = (byte) 1;
    }
}

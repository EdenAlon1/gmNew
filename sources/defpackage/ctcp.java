package defpackage;

import android.media.AudioAttributes;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctcp extends ctcf {
    public ctch a;
    public Optional b = Optional.empty();
    private Optional c = Optional.empty();
    private final Optional d = Optional.empty();
    private Optional e = Optional.empty();
    private Optional f = Optional.empty();

    @Override // defpackage.ctcf
    public final ctci a() {
        ctch ctchVar = this.a;
        if (ctchVar != null) {
            return new ctcq(ctchVar, this.b, this.c, this.d, this.e, this.f);
        }
        throw new IllegalStateException("Missing required properties: dataSource");
    }

    @Override // defpackage.ctcf
    public final void b(AudioAttributes audioAttributes) {
        this.e = Optional.of(audioAttributes);
    }

    @Override // defpackage.ctcf
    public final void c(ctce ctceVar) {
        this.f = Optional.of(ctceVar);
    }

    @Override // defpackage.ctcf
    public final void d(float f) {
        this.c = Optional.of(Float.valueOf(f));
    }
}

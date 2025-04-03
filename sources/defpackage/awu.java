package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awu extends aug {
    public final int b;
    public final int c;
    private final avm d;

    public awu(avr avrVar, Size size, avm avmVar) {
        super(avrVar);
        if (size == null) {
            this.b = super.c();
            this.c = super.b();
        } else {
            this.b = size.getWidth();
            this.c = size.getHeight();
        }
        this.d = avmVar;
    }

    @Override // defpackage.aug, defpackage.avr
    public final int b() {
        return this.c;
    }

    @Override // defpackage.aug, defpackage.avr
    public final int c() {
        return this.b;
    }

    @Override // defpackage.aug, defpackage.avr
    public final avm e() {
        return this.d;
    }
}

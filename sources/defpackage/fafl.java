package defpackage;

import android.util.Size;
import com.google.research.xeno.effect.InputFrameSource;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fafl implements awz {
    public static final String a = "fafl";
    public final exmf b;
    public final exku c;
    public final faem d;
    public exkv e;
    public fafk f;
    public int g = -1;
    public int h = -1;

    public fafl(Object obj, faem faemVar) {
        exmf exmfVar = new exmf(obj);
        this.b = exmfVar;
        exku exkuVar = new exku(exmfVar.c);
        this.c = exkuVar;
        exkuVar.a(faemVar);
        this.d = faemVar;
    }

    @Override // defpackage.awz
    public final void a(axt axtVar) {
        throw null;
    }

    @Override // defpackage.awz
    public final void b(awy awyVar) {
        throw null;
    }

    public final synchronized void c(InputFrameSource inputFrameSource) {
        if (this.g <= 0 || this.h <= 0) {
            return;
        }
        this.d.d();
        this.d.c(inputFrameSource, new Size(this.h, this.g), null, null);
    }
}

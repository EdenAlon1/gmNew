package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebnl extends ebnn {
    public int a;
    public Drawable b;
    public int c;
    public String d;
    public int e;
    public View.OnClickListener f;
    public final emxc g = emux.a;
    public byte h;

    @Override // defpackage.ebnn
    public final void a(int i) {
        this.a = i;
        this.h = (byte) (this.h | 1);
    }

    @Override // defpackage.ebnn
    public final void b(int i) {
        this.e = i;
        this.h = (byte) (this.h | 4);
    }
}

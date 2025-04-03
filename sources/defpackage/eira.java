package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eira {
    public int a;
    private boolean b;

    public eira() {
        this.a = R.style.SudThemeGlif_DayNight;
        this.b = true;
    }

    public final eirb a() {
        return new eirb(this.a, this.b);
    }

    public final void b() {
        this.b = true;
    }

    public eira(eirb eirbVar) {
        this.a = R.style.SudThemeGlif_DayNight;
        this.b = true;
        this.a = eirbVar.b;
        String str = eirbVar.c;
        this.b = eirbVar.d;
    }
}

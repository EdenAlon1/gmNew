package defpackage;

import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elbt implements SeekBar.OnSeekBarChangeListener {
    boolean a;
    ekzm b;
    final /* synthetic */ SeekBar.OnSeekBarChangeListener c;
    final /* synthetic */ String d = "AudioAttachmentView";
    final /* synthetic */ elbx e;

    public elbt(elbx elbxVar, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.c = onSeekBarChangeListener;
        this.e = elbxVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (ekyf.v() || !z) {
            this.c.onProgressChanged(seekBar, i, z);
            return;
        }
        if (this.a) {
            ekzm a = ekyf.a(this.b);
            try {
                this.c.onProgressChanged(seekBar, i, true);
                return;
            } finally {
                ekyf.a(a);
            }
        }
        ekzm b = this.e.b(this.d.concat("#onProgressChanged"));
        try {
            this.c.onProgressChanged(seekBar, i, true);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a = true;
        if (ekyf.v()) {
            ekzz f = eleg.f(this.d.concat("#onStartTrackingTouch"));
            try {
                this.b = f.a;
                this.c.onStartTrackingTouch(seekBar);
                f.close();
                return;
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ekzm b = this.e.b(this.d.concat("#onStartTrackingTouch"));
        try {
            this.b = b;
            this.c.onStartTrackingTouch(seekBar);
            b.close();
        } catch (Throwable th3) {
            try {
                b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a = false;
        ekzm a = ekyf.a(this.b);
        try {
            this.c.onStopTrackingTouch(seekBar);
        } finally {
            ekyf.a(a);
            this.b = null;
        }
    }
}

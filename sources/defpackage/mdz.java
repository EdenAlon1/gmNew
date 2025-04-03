package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdz {
    public mgi b;
    private final emyl c;
    private final Handler d;
    private lpk e;
    private int g;
    private lsm h;
    public float a = 1.0f;
    private int f = 0;

    public mdz(final Context context, Handler handler, mgi mgiVar) {
        this.c = emys.a(new emyl() { // from class: mdx
            @Override // defpackage.emyl
            public final Object get() {
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                lti.f(audioManager);
                return audioManager;
            }
        });
        this.b = mgiVar;
        this.d = handler;
    }

    public final int a(boolean z, int i) {
        int requestAudioFocus;
        if (i == 1 || this.g != 1) {
            b();
            e(0);
            return 1;
        }
        if (!z) {
            int i2 = this.f;
            if (i2 != 1) {
                return i2 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.f == 2) {
            return 1;
        }
        if (this.h == null) {
            lpk lpkVar = lpk.a;
            boolean f = f();
            lpk lpkVar2 = this.e;
            lti.f(lpkVar2);
            this.h = new lsm(new AudioManager.OnAudioFocusChangeListener() { // from class: mdy
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i3) {
                    mdz mdzVar = mdz.this;
                    if (i3 == -3 || i3 == -2) {
                        if (i3 != -2 && !mdzVar.f()) {
                            mdzVar.e(4);
                            return;
                        } else {
                            mdzVar.c(0);
                            mdzVar.e(3);
                            return;
                        }
                    }
                    if (i3 == -1) {
                        mdzVar.c(-1);
                        mdzVar.b();
                        mdzVar.e(1);
                    } else if (i3 != 1) {
                        luj.f("AudioFocusManager", a.h(i3, "Unknown focus change type: "));
                    } else {
                        mdzVar.e(2);
                        mdzVar.c(1);
                    }
                }
            }, this.d, lpkVar2, f);
        }
        AudioManager audioManager = (AudioManager) this.c.get();
        lsm lsmVar = this.h;
        int i3 = lvf.a;
        requestAudioFocus = audioManager.requestAudioFocus(lsmVar.a());
        if (requestAudioFocus == 1) {
            e(2);
            return 1;
        }
        e(1);
        return -1;
    }

    public final void b() {
        int i = this.f;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.c.get();
        lsm lsmVar = this.h;
        int i2 = lvf.a;
        audioManager.abandonAudioFocusRequest(lsmVar.a());
    }

    public final void c(int i) {
        mgi mgiVar = this.b;
        if (mgiVar != null) {
            int ag = mgl.ag(i);
            mgl mglVar = mgiVar.a;
            mglVar.ar(mglVar.Y(), i, ag);
        }
    }

    public final void d(lpk lpkVar) {
        int i;
        if (emxb.a(this.e, lpkVar)) {
            return;
        }
        this.e = lpkVar;
        if (lpkVar == null) {
            i = 0;
        } else {
            if (lpkVar.c == 0) {
                luj.f("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
            }
            i = 1;
        }
        this.g = i;
        lti.b(true, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void e(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.a != f) {
            this.a = f;
            mgi mgiVar = this.b;
            if (mgiVar != null) {
                mgl mglVar = mgiVar.a;
                mglVar.g.e.d(32, Float.valueOf(mglVar.v * mglVar.m.a)).b();
            }
        }
    }

    public final boolean f() {
        lpk lpkVar = this.e;
        return lpkVar != null && lpkVar.b == 1;
    }
}

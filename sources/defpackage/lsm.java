package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsm {
    public final int a = 1;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final lpk d;
    public final boolean e;
    private final Object f;

    public lsm(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, lpk lpkVar, boolean z) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        AudioFocusRequest build;
        this.c = handler;
        this.d = lpkVar;
        this.e = z;
        int i = lvf.a;
        this.b = onAudioFocusChangeListener;
        audioAttributes = new AudioFocusRequest.Builder(1).setAudioAttributes(lpkVar.a().a);
        willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z);
        onAudioFocusChangeListener2 = willPauseWhenDucked.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
        build = onAudioFocusChangeListener2.build();
        this.f = build;
    }

    public final AudioFocusRequest a() {
        Object obj = this.f;
        lti.f(obj);
        return ni$$ExternalSyntheticApiModelOutline0.m(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsm)) {
            return false;
        }
        lsm lsmVar = (lsm) obj;
        int i = lsmVar.a;
        return this.e == lsmVar.e && Objects.equals(this.b, lsmVar.b) && Objects.equals(this.c, lsmVar.c) && Objects.equals(this.d, lsmVar.d);
    }

    public final int hashCode() {
        return Objects.hash(1, this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}

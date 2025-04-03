package defpackage;

import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtjq extends dtit {
    public static final enru a = enru.c("com/google/android/libraries/compose/voice/ui/screen/VoiceScreen");
    private ComposeView ag;
    private final ffbz ah;
    private ffud ai;
    public dqli b;
    public AudioManager c;
    public dtld d;
    private final dszr e;

    public dtjq() {
        super(Integer.valueOf(R.layout.voice_screen));
        this.e = dszr.g;
        this.ah = ffca.a(new ffix() { // from class: dtjc
            @Override // defpackage.ffix
            public final Object invoke() {
                return new dszy(dtjq.this.N());
            }
        });
    }

    static /* synthetic */ void bg(dtjq dtjqVar, int i, int i2, View.OnClickListener onClickListener) {
        dszy.c(dtjqVar.bh(), null, Integer.valueOf(i), null, Integer.valueOf(i2), onClickListener, 1);
        ComposeView composeView = dtjqVar.ag;
        if (composeView == null) {
            ffkj.c("contentComposeView");
            composeView = null;
        }
        composeView.setVisibility(8);
    }

    private final dszy bh() {
        return (dszy) this.ah.a();
    }

    public static final /* synthetic */ dtiz f(dtjq dtjqVar) {
        return (dtiz) dtjqVar.bA();
    }

    public final void aU() {
        bh().a();
        ComposeView composeView = this.ag;
        if (composeView == null) {
            ffkj.c("contentComposeView");
            composeView = null;
        }
        composeView.setVisibility(0);
    }

    @Override // defpackage.dtaa
    protected final void aZ(dsjz dsjzVar) {
        bh().b(dsjzVar.h, dsjzVar.i);
    }

    @Override // defpackage.ea
    public final void ai() {
        super.ai();
        dtld r = r();
        r.b();
        dtdy dtdyVar = (dtdy) r.b;
        dtdyVar.f();
        dtdyVar.e().release();
        dtdyVar.b.f(false);
        dtdyVar.c.f(false);
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        view.getClass();
        this.ag = (ComposeView) view.findViewById(R.id.screen_content_compose_view);
        bQ();
        bJ();
    }

    public final void bb() {
        aU();
        dtjj dtjjVar = new dtjj(((dtiz) bA()).e);
        ComposeView composeView = this.ag;
        if (composeView == null) {
            ffkj.c("contentComposeView");
            composeView = null;
        }
        composeView.a(new hpw(-2005834357, true, new dtjm(this, dtjjVar)));
        if (this.ai == null) {
            this.ai = ffqy.d(bF(), null, null, new dtjp(this, null), 3);
        }
    }

    @Override // defpackage.dtaa
    public final void bd() {
        dtik dtikVar = ((dtiz) bA()).c;
        Object c = ((dtiz) bA()).a.c();
        dtjb dtjbVar = dtja.b;
        dtij.a(dtikVar, c != dtjbVar, false, (dteh) r().g.c(), 2);
        if (((dtiz) bA()).i) {
            dtld r = r();
            r.b();
            r.b.c(true);
        }
        ffud ffudVar = this.ai;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        ComposeView composeView = null;
        this.ai = null;
        ComposeView composeView2 = this.ag;
        if (composeView2 == null) {
            ffkj.c("contentComposeView");
        } else {
            composeView = composeView2;
        }
        composeView.f();
    }

    @Override // defpackage.dtaa
    public final void be() {
        AudioManager audioManager = this.c;
        if (audioManager == null) {
            ffkj.c("audioManager");
            audioManager = null;
        }
        int mode = audioManager.getMode();
        if (mode != 2 && mode != 3) {
            ffqy.d(bF(), null, null, new dtjg(this, null), 3);
        } else {
            ((enrr) a.h().h("com/google/android/libraries/compose/voice/ui/screen/VoiceScreen", "onOpen", 70, "VoiceScreen.kt")).q("Cannot record audio while a call is in progress.");
            bg(this, R.string.voice_recording_call_in_progress_description, R.string.start_recording_when_call_end, new View.OnClickListener() { // from class: dtjd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dtjq.this.be();
                }
            });
        }
    }

    public final dqli e() {
        dqli dqliVar = this.b;
        if (dqliVar != null) {
            return dqliVar;
        }
        ffkj.c("permissionsManager");
        return null;
    }

    public final dtld r() {
        dtld dtldVar = this.d;
        if (dtldVar != null) {
            return dtldVar;
        }
        ffkj.c("uiAdapter");
        return null;
    }

    @Override // defpackage.dsyk
    public final dsyj s() {
        return null;
    }

    @Override // defpackage.dtaa
    public final dszr t() {
        return this.e;
    }
}

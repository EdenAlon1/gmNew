package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hvh implements isw {
    private ffsk a;
    private boolean b;
    private boolean c;
    public int q;
    public hvh s;
    public hvh t;
    public iwq u;
    public iwi v;
    public boolean w;
    public boolean x;
    public ffix y;
    public boolean z;
    public hvh p = this;
    public int r = -1;

    @Override // defpackage.isw
    public final hvh C() {
        return this.p;
    }

    public final ffsk D() {
        ffsk ffskVar = this.a;
        if (ffskVar != null) {
            return ffskVar;
        }
        ffsk b = ffsl.b(((AndroidComposeView) isx.f(this)).e.plus(new ffuf((ffud) ((AndroidComposeView) isx.f(this)).e.get(ffud.c))));
        this.a = b;
        return b;
    }

    public void E() {
        if (this.z) {
            imn.c("node attached multiple times");
        }
        if (this.v == null) {
            imn.c("attach invoked on a node without a coordinator");
        }
        this.z = true;
        this.b = true;
    }

    public void F() {
        if (!this.z) {
            imn.c("Cannot detach a node that is not attached");
        }
        if (this.b) {
            imn.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.c) {
            imn.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.z = false;
        ffsk ffskVar = this.a;
        if (ffskVar != null) {
            ffsl.e(ffskVar, new hvj());
            this.a = null;
        }
    }

    public void G() {
        if (!this.z) {
            imn.c("reset() called on an unattached node");
        }
        dS();
    }

    public void H() {
        if (!this.z) {
            imn.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.b) {
            imn.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.b = false;
        dT();
        this.c = true;
    }

    public void I() {
        if (!this.z) {
            imn.c("node detached multiple times");
        }
        if (this.v == null) {
            imn.c("detach invoked on a node without a coordinator");
        }
        if (!this.c) {
            imn.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.c = false;
        ffix ffixVar = this.y;
        if (ffixVar != null) {
            ffixVar.invoke();
        }
        t();
    }

    public void J(hvh hvhVar) {
        this.p = hvhVar;
    }

    public void K(iwi iwiVar) {
        this.v = iwiVar;
    }

    public boolean dM() {
        return true;
    }

    public /* synthetic */ void dK() {
    }

    public /* synthetic */ void dL() {
    }

    public void dS() {
    }

    public void dT() {
    }

    public void t() {
    }
}

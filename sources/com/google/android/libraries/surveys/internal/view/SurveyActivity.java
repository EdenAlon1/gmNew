package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import defpackage.abo;
import defpackage.ea;
import defpackage.efnc;
import defpackage.efnd;
import defpackage.efor;
import defpackage.efpb;
import defpackage.efsc;
import defpackage.efsi;
import defpackage.efsj;
import defpackage.efsw;
import defpackage.fdvg;
import defpackage.fdvs;
import defpackage.iy;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SurveyActivity extends iy implements efsj {
    public efsi n;
    private final abo o = new efsc(this);

    @Override // defpackage.efsd
    public final boolean aV() {
        return false;
    }

    @Override // defpackage.efsd
    public final boolean aW() {
        return this.n.m();
    }

    @Override // defpackage.efps
    public final void aX() {
        this.n.j(false);
    }

    @Override // defpackage.efsd
    public final void e() {
        this.n.e();
    }

    @Override // defpackage.efsd
    public final void f() {
        ImageButton imageButton = (ImageButton) this.n.b(R.id.survey_close_button);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03f0  */
    @Override // defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.view.SurveyActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        efsi efsiVar = this.n;
        if (efor.b == null) {
            return;
        }
        if (efor.d()) {
            efnc c = efsiVar.c();
            if (efsiVar.v.isFinishing() && c != null) {
                efnd.a.c(c);
            }
        } else if (efsiVar.v.isFinishing()) {
            efnd.a.b();
        }
        efsiVar.q.removeCallbacks(efsiVar.r);
    }

    @Override // defpackage.abe, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        efsi efsiVar = this.n;
        if (intent.getBooleanExtra("IsDismissing", false)) {
            efsiVar.v.finish();
        }
        if (intent.hasExtra("IsPausing")) {
            efsiVar.g(intent.getBooleanExtra("IsPausing", false));
        }
    }

    @Override // defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        efsi efsiVar = this.n;
        efpb efpbVar = efor.c;
        if (efor.b(fdvs.c(efor.b))) {
            SurveyViewPager surveyViewPager = efsiVar.d;
            bundle.putInt("CurrentQuestionIndexForViewPager", surveyViewPager != null ? surveyViewPager.c : 0);
        } else {
            bundle.putInt("CurrentQuestionIndexForViewPager", efsiVar.a());
        }
        bundle.putBoolean("IsSubmitting", efsiVar.k);
        bundle.putParcelable("Answer", efsiVar.e);
        bundle.putBundle("SingleSelectOrdinalAnswerMappings", efsiVar.g);
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        efpb efpbVar = efor.c;
        if (!fdvg.b(this)) {
            return this.n.n(motionEvent);
        }
        if (this.n.n(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.efps
    public final void p() {
        this.n.f();
    }

    @Override // defpackage.efpt
    public final void q(boolean z, ea eaVar) {
        efsi efsiVar = this.n;
        if (efsiVar.k || efsw.m(eaVar) != efsiVar.d.c) {
            return;
        }
        efsiVar.i(z);
    }

    @Override // defpackage.efps
    public final void t(boolean z) {
        this.n.i(z);
    }

    @Override // defpackage.efsj
    public final Activity b() {
        return this;
    }
}

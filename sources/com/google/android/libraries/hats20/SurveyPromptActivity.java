package com.google.android.libraries.hats20;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.view.SurveyViewPager;
import defpackage.dujt;
import defpackage.dujv;
import defpackage.dujx;
import defpackage.dukb;
import defpackage.dukm;
import defpackage.duko;
import defpackage.duks;
import defpackage.dula;
import defpackage.dulb;
import defpackage.dulc;
import defpackage.dull;
import defpackage.ea;
import defpackage.eujx;
import defpackage.euka;
import defpackage.euke;
import defpackage.euki;
import defpackage.eukk;
import defpackage.evpr;
import defpackage.evpt;
import defpackage.evpu;
import defpackage.evpv;
import defpackage.eydl;
import defpackage.eyfy;
import defpackage.eygi;
import defpackage.eygr;
import defpackage.iy;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SurveyPromptActivity extends iy implements duks, dulb, dula {
    private dujx A;
    private LinearLayout B;
    private TextView C;
    private TextView D;
    private int E;
    private dull F;
    private boolean G;
    private int I;
    private boolean J;
    public FrameLayout n;
    public LinearLayout o;
    public boolean q;
    private dukm s;
    private RectF t;
    private evpr u;
    private eukk v;
    private String w;
    private SurveyViewPager y;
    private dujv z;
    private final Point r = new Point(0, 0);
    private int x = 0;
    public String p = "";
    private final Handler H = new Handler();

    public static void H(Activity activity, String str, evpr evprVar, eukk eukkVar, dujv dujvVar, Integer num, boolean z, boolean z2, int i) {
        Intent intent = new Intent();
        intent.setClassName(activity, "com.google.android.libraries.hats20.SurveyPromptActivity");
        intent.putExtra("SiteId", str);
        intent.putExtra("Survey", evprVar.toByteArray());
        intent.putExtra("SurveyPayload", eukkVar.toByteArray());
        intent.putExtra("AnswerBeacon", dujvVar);
        intent.putExtra("IsFullWidth", z);
        intent.putExtra("IgnoreFirstQuestion", z2);
        intent.putExtra("PromplessRatingLogo", i);
        Log.d("HatsLibSurveyActivity", String.format("Starting survey for client activity: %s", activity.getClass().getCanonicalName()));
        if (num == null) {
            activity.startActivity(intent);
        } else {
            activity.startActivityForResult(intent, num.intValue());
        }
    }

    private final int I() {
        SurveyViewPager surveyViewPager = this.y;
        if (surveyViewPager == null) {
            return 0;
        }
        int i = surveyViewPager.c;
        return this.J ? i + 1 : i;
    }

    private final String J() {
        evpr evprVar = this.u;
        if ((evprVar.b & 256) != 0) {
            if (Patterns.WEB_URL.matcher(evprVar.j.toLowerCase()).matches() && (URLUtil.isHttpUrl(this.u.j) || URLUtil.isHttpsUrl(this.u.j))) {
                Uri parse = Uri.parse(this.u.j);
                try {
                    return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), parse.getQuery() != null ? URLEncoder.encode(parse.getQuery(), "utf-8") : "").toString();
                } catch (UnsupportedEncodingException | URISyntaxException e) {
                    Log.e("HatsLibSurveyActivity", e.getMessage());
                }
            }
        }
        return "";
    }

    private final void K() {
        this.y.v().Q.sendAccessibilityEvent(32);
    }

    private final void L(boolean z) {
        Button button = (Button) findViewById(R.id.hats_lib_next);
        if (button == null || button.isEnabled() == z) {
            return;
        }
        button.setAlpha(true != z ? 0.3f : 1.0f);
        button.setEnabled(z);
    }

    private final void M(boolean z) {
        TextView textView = this.C;
        textView.announceForAccessibility(textView.getContentDescription());
        ViewPropertyAnimator duration = this.C.animate().alpha(1.0f).setDuration(350L);
        long j = true != z ? 0 : 700;
        duration.setStartDelay(j);
        this.C.setVisibility(0);
        if (this.p.isEmpty()) {
            dukb.c().b().a = true;
            this.H.postDelayed(new dujt(this), 2400L);
        } else {
            this.D.animate().alpha(1.0f).setDuration(350L).setStartDelay(j);
            this.D.setVisibility(0);
        }
    }

    private final void N() {
        Button button = (Button) findViewById(R.id.hats_lib_next);
        if (button == null || !this.y.x()) {
            return;
        }
        button.setText(R.string.hats_lib_submit);
    }

    private final void O() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.n.getLayoutParams();
        int i = duko.a(this).x;
        int i2 = duko.a(this).y;
        Resources resources = getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = (i2 - (identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0)) - Math.round(this.t.top + this.t.bottom);
        if (!this.G) {
            i = this.s.b();
        }
        Point point = new Point(i, Math.min(dimensionPixelSize, this.r.y));
        layoutParams.width = point.x - Math.round(this.t.left + this.t.right);
        layoutParams.height = point.y > 0 ? point.y : this.E;
        this.n.setAlpha(1.0f);
        layoutParams.setMargins(Math.round(this.t.left), Math.round(this.t.top), Math.round(this.t.right), Math.round(this.t.bottom));
        this.n.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean Q(int i) {
        if (i >= this.v.b.size()) {
            return false;
        }
        euka eukaVar = (euka) this.v.b.get(i);
        ArrayList<String> arrayList = new ArrayList();
        int b = euki.b(eukaVar.d);
        if (b == 0) {
            b = 1;
        }
        int i2 = b - 2;
        if (i2 == 1 || i2 == 2) {
            for (eujx eujxVar : eukaVar.e) {
                if (eujxVar.c == 0) {
                    arrayList.add(eujxVar.b);
                }
            }
        } else if (i2 == 4) {
            euke eukeVar = eukaVar.f;
            if (eukeVar == null) {
                eukeVar = euke.a;
            }
            eygi eygiVar = eukeVar.d;
            int i3 = 0;
            while (i3 < eygiVar.size()) {
                int i4 = i3 + 1;
                if (((Integer) eygiVar.get(i3)).intValue() == 0) {
                    arrayList.add(String.valueOf(i4));
                }
                i3 = i4;
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        eygr eygrVar = ((evpt) this.z.b.get(i)).d;
        for (String str : arrayList) {
            Iterator<E> it = eygrVar.iterator();
            while (it.hasNext()) {
                if (str.equals((String) it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.duks
    public final Point B() {
        Point a = duko.a(this);
        a.x = Math.min(a.x, this.s.b() - Math.round(this.t.left + this.t.right));
        return new Point(View.MeasureSpec.makeMeasureSpec(a.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(a.y, Integer.MIN_VALUE));
    }

    public final void C() {
        SurveyViewPager surveyViewPager = this.y;
        if (surveyViewPager == null || !(surveyViewPager.v() instanceof dulc)) {
            return;
        }
        dulc dulcVar = (dulc) this.y.v();
        ((InputMethodManager) dulcVar.G().getSystemService("input_method")).hideSoftInputFromWindow(dulcVar.d.getWindowToken(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181 A[SYNTHETIC] */
    @Override // defpackage.dula
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.hats20.SurveyPromptActivity.D():void");
    }

    @Override // defpackage.duks
    public final void E(int i, int i2) {
        this.x++;
        this.r.x = Math.max(this.r.x, i);
        this.r.y = Math.max(this.r.y, i2);
        if (this.x == this.F.j()) {
            this.x = 0;
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.hats_lib_survey_controls_container);
            if (frameLayout != null) {
                this.r.y += frameLayout.getMeasuredHeight();
            }
            this.y.w();
            if (this.z.a.getString("t") == null) {
                G("sv");
            }
            O();
            Window window = getWindow();
            window.addFlags(2);
            window.clearFlags(32);
            window.addFlags(262144);
            window.setDimAmount(0.4f);
            if (this.s.a.getResources().getBoolean(R.bool.hats_lib_survey_should_display_close_button)) {
                findViewById(R.id.hats_lib_close_button).setVisibility(0);
            }
            K();
        }
    }

    @Override // defpackage.dulb
    public final void F(boolean z, ea eaVar) {
        if (dull.m(eaVar) == this.y.c) {
            L(z);
        }
    }

    public final void G(String str) {
        this.z.c(str);
        this.A.a(this.z);
    }

    @Override // android.app.Activity
    public final void finish() {
        if (getCallingActivity() != null) {
            evpu evpuVar = (evpu) evpv.a.createBuilder();
            evpr evprVar = this.u;
            evpuVar.copyOnWrite();
            evpv evpvVar = (evpv) evpuVar.instance;
            evprVar.getClass();
            evpvVar.d = evprVar;
            evpvVar.b |= 2;
            List list = this.z.b;
            evpuVar.copyOnWrite();
            evpv evpvVar2 = (evpv) evpuVar.instance;
            eygr eygrVar = evpvVar2.e;
            if (!eygrVar.c()) {
                evpvVar2.e = eyfy.mutableCopy(eygrVar);
            }
            eydl.addAll(list, evpvVar2.e);
            int i = true == "a".equals(this.z.a.getString("t")) ? 1 : 2;
            evpuVar.copyOnWrite();
            evpv evpvVar3 = (evpv) evpuVar.instance;
            evpvVar3.c = i;
            evpvVar3.b = 1 | evpvVar3.b;
            setResult(-1, new Intent().putExtra("ExtraResultSurveyResponse", ((evpv) evpuVar.build()).toByteArray()).putExtra("ExtraResultAnswerBeaconString", this.z.a(false).getQuery()));
        }
        super.finish();
    }

    @Override // defpackage.abe, android.app.Activity
    public final void onBackPressed() {
        G("o");
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0239  */
    @Override // defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.hats20.SurveyPromptActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            dukb.c().a().a();
        }
        this.H.removeCallbacks(null);
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onPostResume() {
        super.onPostResume();
        if (this.q && this.p.isEmpty()) {
            finish();
        }
    }

    @Override // defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("CurrentQuestionIndex", I());
        bundle.putBoolean("IsSubmitting", this.q);
        bundle.putParcelable("AnswerBeacon", this.z);
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            this.n.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && this.q) {
                Log.d("HatsLibSurveyActivity", "User clicked outside of survey root container when showing thank-you page. Closing.");
                finish();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}

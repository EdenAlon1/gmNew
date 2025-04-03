package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import defpackage.emxg;
import defpackage.lsy;
import defpackage.lsz;
import defpackage.lti;
import defpackage.ntx;
import defpackage.nty;
import defpackage.nwd;
import defpackage.nwe;
import defpackage.nwh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    private List a;
    private nty b;
    private float c;
    private float d;
    private boolean e;
    private boolean f;
    private nwe g;
    private View h;

    public SubtitleView(Context context) {
        this(context, null);
    }

    private final void d() {
        List arrayList;
        nwe nweVar = this.g;
        if (this.e && this.f) {
            arrayList = this.a;
        } else {
            arrayList = new ArrayList(this.a.size());
            for (int i = 0; i < this.a.size(); i++) {
                lsy lsyVar = new lsy((lsz) this.a.get(i));
                if (!this.e) {
                    lsyVar.b();
                    CharSequence charSequence = lsyVar.a;
                    if (charSequence instanceof Spanned) {
                        if (!(charSequence instanceof Spannable)) {
                            lsyVar.a = SpannableString.valueOf(charSequence);
                        }
                        CharSequence charSequence2 = lsyVar.a;
                        lti.f(charSequence2);
                        nwh.c((Spannable) charSequence2, new emxg() { // from class: nwf
                            @Override // defpackage.emxg
                            public final boolean a(Object obj) {
                                return !(obj instanceof ltd);
                            }
                        });
                    }
                    nwh.b(lsyVar);
                } else if (!this.f) {
                    nwh.b(lsyVar);
                }
                arrayList.add(lsyVar.a());
            }
        }
        nty ntyVar = this.b;
        float f = this.c;
        float f2 = this.d;
        ntx ntxVar = (ntx) nweVar;
        ntxVar.b = arrayList;
        ntxVar.d = ntyVar;
        ntxVar.c = f;
        ntxVar.e = f2;
        while (ntxVar.a.size() < arrayList.size()) {
            ntxVar.a.add(new nwd(ntxVar.getContext()));
        }
        ntxVar.invalidate();
    }

    public final void a(List list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.a = list;
        d();
    }

    public final void b() {
        nty ntyVar;
        if (isInEditMode()) {
            ntyVar = nty.a;
        } else {
            CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
            if (captioningManager == null || !captioningManager.isEnabled()) {
                ntyVar = nty.a;
            } else {
                CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
                ntyVar = new nty(userStyle.hasForegroundColor() ? userStyle.foregroundColor : nty.a.b, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : nty.a.c, userStyle.hasWindowColor() ? userStyle.windowColor : nty.a.d, userStyle.hasEdgeType() ? userStyle.edgeType : nty.a.e, userStyle.hasEdgeColor() ? userStyle.edgeColor : nty.a.f, userStyle.getTypeface());
            }
        }
        this.b = ntyVar;
        d();
    }

    public final void c() {
        CaptioningManager captioningManager;
        float f = 1.0f;
        if (!isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            f = captioningManager.getFontScale();
        }
        this.c = f * 0.0533f;
        d();
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.EMPTY_LIST;
        this.b = nty.a;
        this.c = 0.0533f;
        this.d = 0.08f;
        this.e = true;
        this.f = true;
        ntx ntxVar = new ntx(context);
        this.g = ntxVar;
        this.h = ntxVar;
        addView(ntxVar);
    }
}

package com.google.android.apps.messaging.shared.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import defpackage.cban;
import defpackage.cbce;
import defpackage.crhr;
import defpackage.crhu;
import defpackage.crhv;
import defpackage.crhw;
import defpackage.crji;
import defpackage.crjm;
import defpackage.csix;
import defpackage.enru;
import defpackage.eorw;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class ContactIconView extends crhu {
    public static final enru h = enru.c("com/google/android/apps/messaging/shared/ui/ContactIconView");
    private final int D;
    private boolean E;
    protected final int i;
    public long j;
    public String k;
    public long l;
    public String m;
    public boolean n;
    public crhr o;
    public eorw p;
    public Optional q;
    public crji r;
    public crhv s;
    public ffbr t;

    public ContactIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = eorw.UNKNOWN_BIZINFO_EVENT_SOURCE;
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, crhw.b);
        int i = obtainStyledAttributes.getInt(0, 0);
        if (i == 0) {
            this.i = (int) resources.getDimension(R.dimen.contact_icon_view_normal_size);
        } else if (i == 1) {
            this.i = (int) resources.getDimension(R.dimen.contact_icon_view_large_size);
        } else if (i == 2) {
            this.i = (int) resources.getDimension(R.dimen.contact_icon_view_small_size);
        } else if (i != 3) {
            this.i = 0;
            csix.c("Unsupported ContactIconView icon size attribute");
        } else {
            this.i = (int) resources.getDimension(R.dimen.contact_icon_view_xlarge_size);
        }
        this.D = resources.getColor(R.color.contact_avatar_pressed_color);
        this.E = true;
        this.n = true;
        obtainStyledAttributes.recycle();
    }

    public final void h(boolean z) {
        this.E = z;
        setOnClickListener(null);
        setClickable(false);
    }

    public final void i(Uri uri) {
        j(uri, 0);
    }

    public final void j(Uri uri, int i) {
        m(uri, -1L, null, -1L, null, i);
    }

    public final void k() {
        this.q.ifPresent(new Consumer() { // from class: crho
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                axul axulVar = (axul) obj;
                ContactIconView contactIconView = ContactIconView.this;
                String str = contactIconView.m;
                axulVar.h(contactIconView, contactIconView.j, contactIconView.k, contactIconView.l, str != null ? ((aolr) contactIconView.t.b()).n(str) : null, 6);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void l(Uri uri, long j, String str, long j2, String str2) {
        m(uri, j, str, j2, str2, 0);
    }

    public final void m(Uri uri, long j, String str, long j2, String str2, int i) {
        if (uri == null) {
            d(null);
        } else {
            String s = crjm.s(uri);
            boolean z = !"g".equals(s);
            if ("s".equals(s)) {
                crji crjiVar = this.r;
                int i2 = this.i;
                d(new cban(crjiVar, uri, i2, i2, true, i));
            } else {
                int i3 = this.i;
                d(new cbce(uri, i3, i3, true, z, i));
            }
        }
        this.j = j;
        this.k = str;
        this.l = j2;
        this.m = str2;
        if (this.E) {
            if ((j <= -1 || TextUtils.isEmpty(str)) && TextUtils.isEmpty(this.m)) {
                setOnClickListener(null);
            } else {
                setOnClickListener(new View.OnClickListener() { // from class: crhn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ContactIconView contactIconView = ContactIconView.this;
                        String str3 = contactIconView.m;
                        if (str3 == null) {
                            contactIconView.k();
                            return;
                        }
                        crhv crhvVar = contactIconView.s;
                        eorw eorwVar = contactIconView.p;
                        altk altkVar = (altk) crhvVar.a.b();
                        altkVar.getClass();
                        ffbr ffbrVar = crhvVar.b;
                        ffbr ffbrVar2 = crhvVar.c;
                        ffbr ffbrVar3 = crhvVar.d;
                        Optional optional = (Optional) crhvVar.e.b();
                        optional.getClass();
                        eorwVar.getClass();
                        contactIconView.o = new crhr(altkVar, ffbrVar, ffbrVar2, ffbrVar3, optional, str3, contactIconView, eorwVar);
                        contactIconView.o.e(new Void[0]);
                    }
                });
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.ui.AsyncImageView, android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        crhr crhrVar = this.o;
        if (crhrVar != null) {
            crhrVar.cancel(true);
            this.o.b = null;
            this.o = null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.n) {
            return false;
        }
        if (this.E && isClickable()) {
            if (motionEvent.getActionMasked() == 0) {
                setColorFilter(this.D);
            } else {
                clearColorFilter();
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}

package com.google.android.apps.messaging.ui;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.ClassZeroActivity;
import defpackage.akzt;
import defpackage.basc;
import defpackage.csix;
import defpackage.ctid;
import defpackage.ctwb;
import defpackage.cwml;
import defpackage.cwox;
import defpackage.cwoz;
import defpackage.ehft;
import defpackage.ffbr;
import defpackage.iv;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClassZeroActivity extends cwoz {
    public ffbr n;
    public ffbr o;
    public ffbr p;
    public basc s;
    private ContentValues A = null;
    public boolean q = false;
    private long B = 0;
    public iv r = null;
    private ArrayList C = null;
    private final Handler D = new cwox(this);
    private final DialogInterface.OnClickListener E = new DialogInterface.OnClickListener() { // from class: cwov
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ClassZeroActivity classZeroActivity = ClassZeroActivity.this;
            ((akzt) classZeroActivity.n.b()).e("Bugle.Sms.ClassZero.Class.MessageDismissed", classZeroActivity.D());
            classZeroActivity.F();
        }
    };
    private final DialogInterface.OnClickListener F = new DialogInterface.OnClickListener() { // from class: cwow
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            ClassZeroActivity classZeroActivity = ClassZeroActivity.this;
            classZeroActivity.q = true;
            classZeroActivity.G();
            dialogInterface.dismiss();
            classZeroActivity.F();
        }
    };

    private final void H(ContentValues contentValues) {
        this.A = contentValues;
        String asString = contentValues.getAsString("body");
        ehft ehftVar = new ehft(this);
        ehftVar.n(asString);
        ehftVar.t(R.string.save, this.F);
        ehftVar.o(android.R.string.cancel, this.E);
        ehftVar.x(R.string.class_0_message_activity);
        ehftVar.j(false);
        this.r = ehftVar.a();
        this.B = SystemClock.uptimeMillis() + 300000;
        ((akzt) this.n.b()).e("Bugle.Sms.ClassZero.Class.ActivityCreated", D());
    }

    private final boolean J(Intent intent) {
        ContentValues contentValues = (ContentValues) intent.getParcelableExtra("message_values");
        if (!TextUtils.isEmpty(contentValues.getAsString("body"))) {
            this.C.add(contentValues);
            return true;
        }
        if (!this.C.isEmpty()) {
            return false;
        }
        finish();
        return false;
    }

    public final int D() {
        ContentValues contentValues = this.A;
        Integer asInteger = contentValues != null ? contentValues.getAsInteger("sub_id") : null;
        if (asInteger == null) {
            asInteger = -1;
        }
        return ((Integer) Optional.ofNullable(((ctwb) this.o.b()).h(asInteger.intValue()).v()).map(new Function() { // from class: cwou
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ermn.h((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(0)).intValue();
    }

    public final void F() {
        if (!this.C.isEmpty()) {
            this.C.remove(0);
        }
        if (this.C.isEmpty()) {
            finish();
        } else {
            H((ContentValues) this.C.get(0));
        }
    }

    public final void G() {
        this.A.put("read", Integer.valueOf(this.q ? 1 : 0));
        this.s.a(this.A).t();
        ((akzt) this.n.b()).e("Bugle.Sms.ClassZero.Class.MessageSaved", D());
    }

    @Override // defpackage.cwps
    public final cwml eY() {
        return cwml.i;
    }

    @Override // defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (ctid.a) {
        }
        if (this.C == null) {
            this.C = new ArrayList();
        }
        if (J(getIntent())) {
            csix.a(1, this.C.size());
            if (this.C.size() == 1) {
                H((ContentValues) this.C.get(0));
            }
            if (bundle != null) {
                this.B = bundle.getLong("timer_fire", this.B);
            }
        }
    }

    @Override // defpackage.efac, defpackage.abe, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        J(intent);
    }

    @Override // defpackage.cwps, defpackage.efac, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("timer_fire", this.B);
    }

    @Override // defpackage.cwps, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStart() {
        super.onStart();
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.B;
        if (j <= uptimeMillis) {
            this.D.sendEmptyMessage(1);
        } else {
            this.D.sendEmptyMessageAtTime(1, j);
        }
    }

    @Override // defpackage.cwps, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onStop() {
        super.onStop();
        this.D.removeMessages(1);
    }
}

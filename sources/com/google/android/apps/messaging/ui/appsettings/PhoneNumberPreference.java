package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.PhoneNumberPreference;
import defpackage.aoku;
import defpackage.aolr;
import defpackage.cwze;
import defpackage.cxjm;
import defpackage.egyl;
import defpackage.ehdr;
import defpackage.ehft;
import defpackage.ekhw;
import defpackage.elbb;
import defpackage.elbx;
import defpackage.emxe;
import defpackage.ffbr;
import defpackage.kse;
import defpackage.ksk;
import defpackage.ooi;
import defpackage.qw;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PhoneNumberPreference extends Preference {
    private final String F;
    public final ffbr a;
    public cxjm b;
    public String c;
    public Optional d;
    public aoku e;
    public boolean f;
    public boolean g;
    public cwze h;
    private final ffbr i;

    /* compiled from: PG */
    public interface a {
        aolr ap();

        elbx eF();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [aolr, java.lang.Object] */
    public PhoneNumberPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = Optional.empty();
        this.c = "";
        String string = context.getString(R.string.unknown_phone_number_pref_display_value);
        this.F = string;
        final a aVar = (a) ekhw.a(context, a.class);
        aVar.getClass();
        ffbr ffbrVar = new ffbr() { // from class: cxat
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return PhoneNumberPreference.a.this.ap();
            }
        };
        this.a = ffbrVar;
        this.i = new ffbr() { // from class: cxau
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return PhoneNumberPreference.a.this.eF();
            }
        };
        this.e = ffbrVar.b().n(string);
    }

    @Override // androidx.preference.Preference
    public final void a(ooi ooiVar) {
        super.a(ooiVar);
        TextView textView = (TextView) ooiVar.C(android.R.id.title);
        if (textView != null) {
            textView.setSingleLine(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [aoku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aoku, java.lang.Object] */
    public final void ab() {
        Optional k = k();
        if (k.isEmpty() || TextUtils.isEmpty(k.get().n())) {
            k = this.d;
        }
        aoku aokuVar = this.e;
        aoku aokuVar2 = aokuVar;
        if (k.isPresent()) {
            aokuVar2 = aokuVar;
            if (!TextUtils.isEmpty(k.get().n())) {
                aokuVar2 = k.get();
            }
        }
        String b = emxe.b(aokuVar2.n());
        if (this.f) {
            b = aokuVar2.G().toString();
        }
        n(kse.a().c(b, ksk.a));
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        final qw qwVar = new qw(this.j);
        qwVar.setTextSize(0, this.j.getResources().getDimensionPixelSize(R.dimen.phone_number_preference_edit_text_size));
        CharSequence m = m();
        if (m != null && !this.F.contentEquals(m)) {
            qwVar.setText(m);
        }
        qwVar.setHint(this.F);
        qwVar.setInputType(3);
        qwVar.setTextAlignment(5);
        qwVar.setPadding(0, qwVar.getPaddingTop(), 0, qwVar.getPaddingBottom());
        qwVar.setTextColor(ehdr.b(qwVar, R.attr.colorOnSurface));
        qwVar.setSelectAllOnFocus(true);
        int dimensionPixelSize = this.j.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        qwVar.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        egyl.c(qwVar);
        ehft ehftVar = new ehft(this.j);
        ehftVar.y(this.q);
        ehftVar.o(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: cxaq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                cwze cwzeVar = PhoneNumberPreference.this.h;
                if (cwzeVar != null) {
                    cwzeVar.a.I.c("Bugle.Preference.Smsc.Editor.Closed.Cancel");
                }
            }
        });
        ehftVar.t(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: cxar
            /* JADX WARN: Type inference failed for: r0v1, types: [aolr, java.lang.Object] */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Editable text = qwVar.getText();
                if (text == null) {
                    return;
                }
                PhoneNumberPreference phoneNumberPreference = PhoneNumberPreference.this;
                phoneNumberPreference.l(phoneNumberPreference.a.b().n(text.toString()));
            }
        });
        if (this.g) {
            ehftVar.q(new elbb((elbx) this.i.b(), "PhoneNumberPreference::dialog::neutralButtonClicked", new DialogInterface.OnClickListener() { // from class: cxas
                /* JADX WARN: Type inference failed for: r3v3, types: [aolr, java.lang.Object] */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PhoneNumberPreference phoneNumberPreference = PhoneNumberPreference.this;
                    phoneNumberPreference.d = Optional.empty();
                    phoneNumberPreference.l(phoneNumberPreference.a.b().n(""));
                }
            }));
        }
        if (!TextUtils.isEmpty(this.c)) {
            ehftVar.n(this.c);
        }
        ehftVar.z(qwVar);
        ehftVar.create().show();
    }

    public final Optional k() {
        if (this.b == null) {
            this.b = cxjm.a(this.d);
        }
        return this.b.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aolr, java.lang.Object] */
    public final void l(aoku aokuVar) {
        aoku aokuVar2;
        final ?? b = this.a.b();
        if (this.f) {
            aokuVar = b.k(aokuVar);
            Optional optional = this.d;
            b.getClass();
            aokuVar2 = (aoku) optional.map(new Function() { // from class: cxap
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return aolr.this.k((aoku) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(this.e);
        } else {
            aokuVar2 = (aoku) this.d.orElse(this.e);
        }
        this.b.b(aokuVar.equals(aokuVar2) ? Optional.empty() : Optional.of(aokuVar));
        ab();
    }

    public final void o(aoku aokuVar) {
        this.d = Optional.of(aokuVar);
    }
}

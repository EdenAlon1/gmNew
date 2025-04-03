package defpackage;

import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddan extends PhoneNumberFormattingTextWatcher {
    final /* synthetic */ ddae a;

    public ddan(ddae ddaeVar) {
        this.a = ddaeVar;
    }

    @Override // android.telephony.PhoneNumberFormattingTextWatcher, android.text.TextWatcher
    public final synchronized void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        this.a.a().setEnabled(!r2.h().isEmpty());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddan(ddae ddaeVar, String str) {
        super(str);
        this.a = ddaeVar;
    }
}

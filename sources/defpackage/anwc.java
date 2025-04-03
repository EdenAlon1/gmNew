package defpackage;

import com.google.android.ims.message.rbm.RbmSuggestionResponse;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anwc implements appi {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public anwc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.appw
    public final /* synthetic */ engw a() {
        int i = engw.d;
        return enou.a;
    }

    @Override // defpackage.appw, defpackage.appj
    public final String b() {
        return RbmSuggestionResponse.CONTENT_TYPE;
    }

    @Override // defpackage.appw
    public final String c() {
        return this.b;
    }

    @Override // defpackage.appi
    public final String d() {
        return this.a;
    }
}

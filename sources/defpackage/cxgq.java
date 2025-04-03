package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxgq {
    public final cxhl a;
    public final cxgb b;
    public final akvg c;
    public final ctml d;
    public Optional e;

    public cxgq(cxgb cxgbVar, akvg akvgVar, ctml ctmlVar, ffbr ffbrVar) {
        this.b = cxgbVar;
        this.c = akvgVar;
        this.d = ctmlVar;
        this.a = ctjd.c() ? ((cxhm) ffbrVar.b()).a(cxgbVar) : null;
    }

    public static SmartSuggestionData b(String str) {
        fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
        fbxb fbxbVar = (fbxb) fbxc.a.createBuilder();
        fbxbVar.copyOnWrite();
        fbxc fbxcVar = (fbxc) fbxbVar.instance;
        str.getClass();
        fbxcVar.c = str;
        fbwzVar.copyOnWrite();
        fbxa fbxaVar = (fbxa) fbwzVar.instance;
        fbxc fbxcVar2 = (fbxc) fbxbVar.build();
        fbxcVar2.getClass();
        fbxaVar.d = fbxcVar2;
        fbxaVar.c = 2;
        fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
        fbri fbriVar = fbri.FULL_MESSAGE;
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).l = fbriVar.a();
        fbwzVar.copyOnWrite();
        fbxa fbxaVar2 = (fbxa) fbwzVar.instance;
        fbwy fbwyVar = (fbwy) fbwxVar.build();
        fbwyVar.getClass();
        fbxaVar2.e = fbwyVar;
        fbxaVar2.b |= 1;
        return new SmartSuggestionItemSuggestionData((fbxa) fbwzVar.build());
    }

    public final Drawable a(int i) {
        cxgb cxgbVar = this.b;
        return ctap.i(cxgbVar.z(), i, ehdr.d(cxgbVar.z(), R.attr.colorOnSurface, "SmartsSettingsFragmentPeer: failed to get color R.attr.colorOnSurfaceVariant"));
    }

    public final Optional c(int i) {
        cxgb cxgbVar = this.b;
        return Optional.ofNullable(cxgbVar.a(cxgbVar.Y(i)));
    }
}

package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtz extends kru {
    final /* synthetic */ ffrf a;
    final /* synthetic */ jrk b;

    public jtz(ffrf ffrfVar, jrk jrkVar) {
        this.a = ffrfVar;
        this.b = jrkVar;
    }

    @Override // defpackage.kru
    public final void a(int i) {
        StringBuilder sb = new StringBuilder("Failed to load ");
        sb.append(this.b);
        sb.append(" (reason=");
        sb.append(i);
        sb.append(", ");
        String str = i != -3 ? i != -2 ? i != -1 ? i != 1 ? i != 2 ? i != 3 ? "Unknown error code" : "The given query was not supported by this provider." : "The provider found the queried font, but it is currently unavailable." : "Font not found, please check availability on GoogleFont.Provider.AllFontsList: https://fonts.gstatic.com/s/a/directory.xml" : "The requested provider was not found on this device." : "The given provider cannot be authenticated with the certificates given." : "Generic error loading font, for example variation settings were not parsable";
        ffrf ffrfVar = this.a;
        sb.append(str);
        sb.append(')');
        ffrfVar.h(new IllegalStateException(sb.toString()));
    }

    @Override // defpackage.kru
    public final void b(Typeface typeface) {
        this.a.w(typeface);
    }
}

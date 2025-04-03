package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewvl extends emwj {
    @Override // defpackage.emwj
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        knr knrVar = (knr) obj;
        return Arrays.hashCode(new Object[]{knrVar.d, knrVar.a, knrVar.c});
    }

    @Override // defpackage.emwj
    protected final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        knr knrVar = (knr) obj;
        knr knrVar2 = (knr) obj2;
        return emxb.a(knrVar.d, knrVar2.d) && TextUtils.equals(knrVar.a, knrVar2.a) && emxb.a(knrVar.c, knrVar2.c);
    }
}

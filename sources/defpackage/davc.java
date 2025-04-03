package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class davc implements dava {
    @Override // defpackage.dava
    public final String a(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replaceAll("[\n\r]+", " ");
    }
}

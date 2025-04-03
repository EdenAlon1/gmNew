package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class davd implements dava {
    @Override // defpackage.dava
    public final String a(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replaceAll("[0-9]", "0");
    }
}

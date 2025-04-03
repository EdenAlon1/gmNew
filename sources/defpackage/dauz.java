package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dauz implements dava {
    @Override // defpackage.dava
    public final String a(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("\"", "\"\"");
    }
}

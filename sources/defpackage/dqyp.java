package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqyp extends adu {
    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        dqyq dqyqVar = (dqyq) obj;
        dqyqVar.getClass();
        Intent intent = new Intent();
        intent.setAction("com.google.chat.smartmessaging.penpal.EMOTIFY");
        intent.putExtra("image_uri", dqyqVar.a);
        intent.putExtra("small_segment_ratio", dqyqVar.b);
        intent.putExtra("enable_edge_to_edge", dqyqVar.c);
        return intent;
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (intent != null) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Uri) intent.getParcelableExtra("resultKey");
            }
        }
        return null;
    }
}

package defpackage;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uat implements kue {
    public static final engw a = engw.u("image/gif", "image/jpeg", "image/png", "video/mp4");
    private final alcb b;
    private final uav c;
    private final bcxm d;

    public uat(alcb alcbVar, uav uavVar, bcxm bcxmVar) {
        this.b = alcbVar;
        this.c = uavVar;
        this.d = bcxmVar;
    }

    @Override // defpackage.kue
    public final ktm a(View view, ktm ktmVar) {
        Context context = view.getContext();
        final ContentResolver contentResolver = context.getContentResolver();
        Pair e = ktmVar.e(new ksy() { // from class: uas
            @Override // defpackage.ksy
            public final /* synthetic */ ksy a(ksy ksyVar) {
                return new ksx(this, ksyVar);
            }

            @Override // defpackage.ksy
            public final boolean b(Object obj) {
                String type;
                engw engwVar = uat.a;
                Uri uri = ((ClipData.Item) obj).getUri();
                return (uri == null || (type = contentResolver.getType(uri)) == null || !uat.a.contains(type)) ? false : true;
            }
        });
        ktm ktmVar2 = (ktm) e.first;
        ktm ktmVar3 = (ktm) e.second;
        if (ktmVar2 != null) {
            ClipData d = ktmVar2.d();
            for (int i = 0; i < d.getItemCount(); i++) {
                Uri uri = d.getItemAt(i).getUri();
                String type = contentResolver.getType(uri);
                int b = ktmVar2.b();
                if (a.contains(type)) {
                    PendingAttachmentData b2 = this.d.b(type, uri, b != 1 ? b != 2 ? b != 3 ? eohh.UNKNOWN : eohh.DRAG_AND_DROP : algx.a(context) == 3 ? eohh.GBOARD_EMOJI : eohh.UNKNOWN_IME : eohh.CLIPBOARD);
                    eppr a2 = dcln.a(b2);
                    b2.h = a2;
                    this.b.g(a2, this.c.a(b2));
                }
            }
        }
        return ktmVar3;
    }
}

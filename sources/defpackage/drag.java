package defpackage;

import android.database.Cursor;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drag {
    public static final enru a = enru.c("com/google/android/libraries/compose/emotify/data/content/EmotifyDataService");
    public final ffsk b;
    public final dqkk c;
    private final ffbz d;

    public drag(final ffbr ffbrVar, dran dranVar, ffsk ffskVar, dqkk dqkkVar) {
        ffbrVar.getClass();
        dranVar.getClass();
        ffskVar.getClass();
        dqkkVar.getClass();
        this.b = ffskVar;
        this.c = dqkkVar;
        this.d = ffca.a(new ffix() { // from class: dqzo
            @Override // defpackage.ffix
            public final Object invoke() {
                efix efixVar = (efix) ffbr.this.b();
                efkj efkjVar = dqzp.a;
                return efixVar.b("emotify", dqzp.a);
            }
        });
    }

    public static final dqzc d(Cursor cursor) {
        byte[] blob;
        Integer valueOf = Integer.valueOf(cursor.getColumnIndex(GroupManagementRequest.DATA_TAG));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf == null || (blob = cursor.getBlob(valueOf.intValue())) == null) {
            throw new IllegalStateException("Column data not found");
        }
        draj drajVar = (draj) eyfy.parseFrom(draj.a, blob, eyfc.a());
        drajVar.getClass();
        return dran.i(drajVar);
    }

    public final dqzc a(Cursor cursor) {
        if (true != cursor.moveToFirst()) {
            cursor = null;
        }
        if (cursor != null) {
            return d(cursor);
        }
        return null;
    }

    public final efiv b() {
        return (efiv) this.d.a();
    }

    public final Object c(String str, ffgu ffguVar) {
        return this.c.d("EmotifyDataService#getCustomSticker", new dqzz(this, str, null), ffguVar);
    }
}

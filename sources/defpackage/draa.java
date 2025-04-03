package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class draa extends ffhv implements ffjn {
    /* synthetic */ Object a;
    final /* synthetic */ drag b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draa(drag dragVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = dragVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        draa draaVar = new draa(this.b, (ffgu) obj3);
        draaVar.a = (Cursor) obj2;
        return draaVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r7 = this.a;
        fffs fffsVar = new fffs((byte[]) null);
        while (r7 != 0 && r7.moveToNext()) {
            try {
                fffsVar.add(drag.d(r7));
            } catch (Exception e) {
                ((enrr) ((enrr) drag.a.i()).g(e).h("com/google/android/libraries/compose/emotify/data/content/EmotifyDataService$getCustomStickers$2$1$1", "invokeSuspend", 62, "EmotifyDataService.kt")).q("Unable to parse sticker, skipping");
            }
        }
        return ffdx.a(fffsVar);
    }
}

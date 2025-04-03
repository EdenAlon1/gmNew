package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edvq {
    static ContentValues a(edxt edxtVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("observation_batch", edxtVar.toByteArray());
        return contentValues;
    }
}

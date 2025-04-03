package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egre {
    private final Activity a;
    private final egjv b;

    public egre(Activity activity, egjv egjvVar) {
        this.a = activity;
        this.b = egjvVar;
    }

    public final void a(Uri uri) {
        egjv egjvVar = this.b;
        this.a.startActivityForResult(new Intent(egjvVar.a, (Class<?>) EditActivity.class).putExtras(egjvVar.a.getIntent()).setData(uri), 10000);
    }
}

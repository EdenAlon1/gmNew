package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.MediaScratchFileProvider;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azyy extends cbgi {

    /* compiled from: PG */
    public interface a {
        ckav ck();
    }

    private final boolean l() {
        return ((a) ekhw.a(getContext(), a.class)).ck().a(Binder.getCallingUid());
    }

    @Override // defpackage.cbgi, defpackage.cbgg
    protected final File a(String str, String str2) {
        if (l()) {
            return super.a(str, str2);
        }
        ensk j = MediaScratchFileProvider.a.j();
        j.Y(ente.a, "BugleRcsEngine");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "getFile", 61, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        return null;
    }

    @Override // defpackage.cbgg, android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        if (l()) {
            return super.delete(uri, str, strArr);
        }
        ensk j = MediaScratchFileProvider.a.j();
        j.Y(ente.a, "BugleRcsEngine");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "delete", 85, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        return 0;
    }

    @Override // defpackage.cbgg, android.content.ContentProvider
    public final String getType(Uri uri) {
        if (!l()) {
            ensk j = MediaScratchFileProvider.a.j();
            j.Y(ente.a, "BugleRcsEngine");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "getType", 137, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        }
        return null;
    }

    @Override // defpackage.cbgg, android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        if (!l()) {
            ensk j = MediaScratchFileProvider.a.j();
            j.Y(ente.a, "BugleRcsEngine");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "insert", 114, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        }
        return null;
    }

    @Override // defpackage.cbgg, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (l()) {
            if (true == "w".equals(str)) {
                str = "wt";
            }
            return super.openFile(uri, str);
        }
        ensk j = MediaScratchFileProvider.a.j();
        j.Y(ente.a, "BugleRcsEngine");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "openFile", 97, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        return null;
    }

    @Override // defpackage.cbgi, defpackage.cbgg, android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (l()) {
            return super.query(uri, strArr, str, strArr2, str2);
        }
        ensk j = MediaScratchFileProvider.a.j();
        j.Y(ente.a, "BugleRcsEngine");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, 74, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        return null;
    }

    @Override // defpackage.cbgg, android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (!l()) {
            ensk j = MediaScratchFileProvider.a.j();
            j.Y(ente.a, "BugleRcsEngine");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "update", 125, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        }
        return 0;
    }
}

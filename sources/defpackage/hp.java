package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class hp implements Parcelable {
    public static final Parcelable.Creator<hp> CREATOR;
    static final cmh a;
    final Bundle b;

    static {
        cmh cmhVar = new cmh();
        a = cmhVar;
        cmhVar.put("android.media.metadata.TITLE", 1);
        cmhVar.put("android.media.metadata.ARTIST", 1);
        cmhVar.put("android.media.metadata.DURATION", 0);
        cmhVar.put("android.media.metadata.ALBUM", 1);
        cmhVar.put("android.media.metadata.AUTHOR", 1);
        cmhVar.put("android.media.metadata.WRITER", 1);
        cmhVar.put("android.media.metadata.COMPOSER", 1);
        cmhVar.put("android.media.metadata.COMPILATION", 1);
        cmhVar.put("android.media.metadata.DATE", 1);
        cmhVar.put("android.media.metadata.YEAR", 0);
        cmhVar.put("android.media.metadata.GENRE", 1);
        cmhVar.put("android.media.metadata.TRACK_NUMBER", 0);
        cmhVar.put("android.media.metadata.NUM_TRACKS", 0);
        cmhVar.put("android.media.metadata.DISC_NUMBER", 0);
        cmhVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        cmhVar.put("android.media.metadata.ART", 2);
        cmhVar.put("android.media.metadata.ART_URI", 1);
        cmhVar.put("android.media.metadata.ALBUM_ART", 2);
        cmhVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        cmhVar.put("android.media.metadata.USER_RATING", 3);
        cmhVar.put("android.media.metadata.RATING", 3);
        cmhVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        cmhVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        cmhVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        cmhVar.put("android.media.metadata.DISPLAY_ICON", 2);
        cmhVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        cmhVar.put("android.media.metadata.MEDIA_ID", 1);
        cmhVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        cmhVar.put("android.media.metadata.MEDIA_URI", 1);
        cmhVar.put("android.media.metadata.ADVERTISEMENT", 0);
        cmhVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new ho();
    }

    public hp(Parcel parcel) {
        this.b = parcel.readBundle(ia.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }
}

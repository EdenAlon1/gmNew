package androidx.car.app.messaging.model;

import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.model.CarText;
import defpackage.cfs;
import defpackage.cgq;
import defpackage.cgx;
import defpackage.knr;
import j$.util.Objects;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class CarMessage {
    private final CarText mBody;
    private final boolean mIsRead;
    private final String mMultimediaMimeType;
    private final Uri mMultimediaUri;
    private final long mReceivedTimeEpochMillis;
    private final Bundle mSender;

    private CarMessage() {
        this.mSender = null;
        this.mBody = null;
        this.mMultimediaMimeType = null;
        this.mMultimediaUri = null;
        this.mReceivedTimeEpochMillis = 0L;
        this.mIsRead = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarMessage)) {
            return false;
        }
        CarMessage carMessage = (CarMessage) obj;
        return cgx.b(getSender(), carMessage.getSender()) && Objects.equals(this.mBody, carMessage.mBody) && this.mReceivedTimeEpochMillis == carMessage.mReceivedTimeEpochMillis && this.mIsRead == carMessage.mIsRead;
    }

    public CarText getBody() {
        return this.mBody;
    }

    public String getMultimediaMimeType() {
        return this.mMultimediaMimeType;
    }

    public Uri getMultimediaUri() {
        return this.mMultimediaUri;
    }

    public long getReceivedTimeEpochMillis() {
        return this.mReceivedTimeEpochMillis;
    }

    public knr getSender() {
        Bundle bundle = this.mSender;
        if (bundle == null) {
            return null;
        }
        return knr.b(bundle);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(cgx.a(getSender())), this.mBody, Long.valueOf(this.mReceivedTimeEpochMillis), Boolean.valueOf(this.mIsRead));
    }

    public boolean isRead() {
        return this.mIsRead;
    }

    public CarMessage(cgq cgqVar) {
        Bundle a;
        knr knrVar = cgqVar.a;
        if (knrVar == null) {
            a = null;
        } else {
            ConversationItem.validateSender(knrVar);
            a = knrVar.a();
        }
        this.mSender = a;
        this.mBody = cgqVar.b;
        this.mMultimediaMimeType = cgqVar.c;
        this.mMultimediaUri = cgqVar.d;
        this.mReceivedTimeEpochMillis = cgqVar.e;
        this.mIsRead = cgqVar.f;
    }
}

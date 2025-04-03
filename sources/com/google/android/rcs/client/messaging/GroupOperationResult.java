package com.google.android.rcs.client.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.eiba;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GroupOperationResult implements Parcelable {
    public static final Parcelable.Creator<GroupOperationResult> CREATOR = new eiba();

    public static GroupOperationResult c(Intent intent) {
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("GROUP_OPERATION_RESULT");
            if (byteArrayExtra == null) {
                throw new IllegalArgumentException("Intent extra is missing GROUP_OPERATION_RESULT key");
            }
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            try {
                try {
                    return CREATOR.createFromParcel(obtain);
                } finally {
                    obtain.recycle();
                }
            } catch (IllegalStateException | NoSuchElementException e) {
                throw new IllegalArgumentException("Error unmarshalling the GroupOperationResult", e);
            }
        } catch (ClassCastException e2) {
            throw new IllegalArgumentException("Wrong value type from the intent extra key GROUP_OPERATION_RESULT", e2);
        }
    }

    public static void d(Intent intent, GroupOperationResult groupOperationResult) {
        Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey("GROUP_OPERATION_RESULT")) {
            throw new IllegalArgumentException("Intent extra already contains GROUP_OPERATION_RESULT key");
        }
        Parcel obtain = Parcel.obtain();
        groupOperationResult.writeToParcel(obtain, 0);
        intent.putExtra("GROUP_OPERATION_RESULT", obtain.marshall());
        obtain.recycle();
    }

    public abstract MessagingResult a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, a(), i, false);
        dfxk.k(parcel, 2, b(), i, false);
        dfxk.c(parcel, a);
    }
}

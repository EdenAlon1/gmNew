package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.IFlpDebugListener;
import com.google.android.gms.location.ILocationListener;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationAvailabilityRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.internal.IBooleanStatusCallback;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;
import com.google.android.gms.location.internal.IGeofencerCallbacks;
import com.google.android.gms.location.internal.ILocationStatusCallback;
import com.google.android.gms.location.internal.ISettingsCallbacks;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGoogleLocationManagerService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGoogleLocationManagerService {
        static final int TRANSACTION_addGeofence = 1;
        static final int TRANSACTION_addGeofenceByGeofencingRequest = 57;
        static final int TRANSACTION_addGeofences = 97;
        static final int TRANSACTION_checkLocationSettings = 63;
        static final int TRANSACTION_flushActivityRecognitionResults = 71;
        static final int TRANSACTION_flushLocations = 67;
        static final int TRANSACTION_getActivityRecognitionMode = 78;
        static final int TRANSACTION_getCurrentLocation = 87;
        static final int TRANSACTION_getCurrentLocationWithCallback = 92;
        static final int TRANSACTION_getLastActivity = 64;
        static final int TRANSACTION_getLastActivityWithFeature = 81;
        static final int TRANSACTION_getLastAvailability = 91;
        static final int TRANSACTION_getLastAvailabilityWithPackage = 34;
        static final int TRANSACTION_getLastLocation = 7;
        static final int TRANSACTION_getLastLocationWithAttribution = 80;
        static final int TRANSACTION_getLastLocationWithCallback = 90;
        static final int TRANSACTION_getLastLocationWithPackage = 21;
        static final int TRANSACTION_getLastLocationWithRequest = 82;
        static final int TRANSACTION_injectLocation = 26;
        static final int TRANSACTION_injectLocationWithCallback = 86;
        static final int TRANSACTION_isGoogleLocationAccuracyEnabled = 95;
        static final int TRANSACTION_isLocationEnabled = 99;
        static final int TRANSACTION_registerDebugListener = 93;
        static final int TRANSACTION_registerLocationClient = 88;
        static final int TRANSACTION_removeActivityTransitionUpdates = 73;
        static final int TRANSACTION_removeActivityUpdates = 6;
        static final int TRANSACTION_removeFloorChangeUpdates = 66;
        static final int TRANSACTION_removeGeofenceByRemoveGeofencingRequest = 74;
        static final int TRANSACTION_removeGeofences = 98;
        static final int TRANSACTION_removeGeofencesByPendingIntent = 2;
        static final int TRANSACTION_removeGeofencesByRequestIds = 3;
        static final int TRANSACTION_removeLocationUpdates = 10;
        static final int TRANSACTION_removeLocationUpdatesWithPendingIntent = 11;
        static final int TRANSACTION_removeSleepSegmentUpdates = 69;
        static final int TRANSACTION_requestActivityTransitionUpdates = 72;
        static final int TRANSACTION_requestActivityUpdates = 5;
        static final int TRANSACTION_requestActivityUpdates2 = 70;
        static final int TRANSACTION_requestFloorChangeUpdates = 65;
        static final int TRANSACTION_requestLocationUpdates = 8;
        static final int TRANSACTION_requestLocationUpdatesInternal = 52;
        static final int TRANSACTION_requestLocationUpdatesInternalWithPendingIntent = 53;
        static final int TRANSACTION_requestLocationUpdatesWithPackage = 20;
        static final int TRANSACTION_requestLocationUpdatesWithPendingIntent = 9;
        static final int TRANSACTION_requestSleepSegmentUpdates = 68;
        static final int TRANSACTION_requestSleepSegments = 79;
        static final int TRANSACTION_setActivityRecognitionMode = 77;
        static final int TRANSACTION_setGoogleLocationAccuracyEnabled = 96;
        static final int TRANSACTION_setMockLocation = 13;
        static final int TRANSACTION_setMockLocationWithCallback = 85;
        static final int TRANSACTION_setMockMode = 12;
        static final int TRANSACTION_setMockModeWithCallback = 84;
        static final int TRANSACTION_unregisterDebugListener = 94;
        static final int TRANSACTION_unregisterLocationClient = 89;
        static final int TRANSACTION_updateDeviceOrientationRequest = 75;
        static final int TRANSACTION_updateLocationRequest = 59;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGoogleLocationManagerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void addGeofence(List<ParcelableGeofence> list, PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeTypedList(list);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.f(obtainAndWriteInterfaceToken, iGeofencerCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void addGeofenceByGeofencingRequest(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, geofencingRequest);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.f(obtainAndWriteInterfaceToken, iGeofencerCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addGeofenceByGeofencingRequest, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, geofencingRequest);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addGeofences, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void checkLocationSettings(LocationSettingsRequest locationSettingsRequest, ISettingsCallbacks iSettingsCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, locationSettingsRequest);
                rve.f(obtainAndWriteInterfaceToken, iSettingsCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_checkLocationSettings, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void flushActivityRecognitionResults(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_flushActivityRecognitionResults, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void flushLocations(IFusedLocationProviderCallback iFusedLocationProviderCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iFusedLocationProviderCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_flushLocations, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public int getActivityRecognitionMode() {
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getActivityRecognitionMode, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public ICancelToken getCurrentLocation(CurrentLocationRequest currentLocationRequest, ILocationStatusCallback iLocationStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, currentLocationRequest);
                rve.f(obtainAndWriteInterfaceToken, iLocationStatusCallback);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getCurrentLocation, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public ICancelToken getCurrentLocationWithCallback(CurrentLocationRequest currentLocationRequest, LocationReceiver locationReceiver) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, currentLocationRequest);
                rve.d(obtainAndWriteInterfaceToken, locationReceiver);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getCurrentLocationWithCallback, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public ActivityRecognitionResult getLastActivity(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(64, obtainAndWriteInterfaceToken);
                ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) rve.a(transactAndReadException, ActivityRecognitionResult.CREATOR);
                transactAndReadException.recycle();
                return activityRecognitionResult;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public ActivityRecognitionResult getLastActivityWithFeature(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getLastActivityWithFeature, obtainAndWriteInterfaceToken);
                ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) rve.a(transactAndReadException, ActivityRecognitionResult.CREATOR);
                transactAndReadException.recycle();
                return activityRecognitionResult;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void getLastAvailability(LocationAvailabilityRequest locationAvailabilityRequest, LocationReceiver locationReceiver) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, locationAvailabilityRequest);
                rve.d(obtainAndWriteInterfaceToken, locationReceiver);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getLastAvailability, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public LocationAvailability getLastAvailabilityWithPackage(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(34, obtainAndWriteInterfaceToken);
                LocationAvailability locationAvailability = (LocationAvailability) rve.a(transactAndReadException, LocationAvailability.CREATOR);
                transactAndReadException.recycle();
                return locationAvailability;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public Location getLastLocation() {
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                Location location = (Location) rve.a(transactAndReadException, Location.CREATOR);
                transactAndReadException.recycle();
                return location;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public Location getLastLocationWithAttribution(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(80, obtainAndWriteInterfaceToken);
                Location location = (Location) rve.a(transactAndReadException, Location.CREATOR);
                transactAndReadException.recycle();
                return location;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void getLastLocationWithCallback(LastLocationRequest lastLocationRequest, LocationReceiver locationReceiver) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, lastLocationRequest);
                rve.d(obtainAndWriteInterfaceToken, locationReceiver);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getLastLocationWithCallback, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public Location getLastLocationWithPackage(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken);
                Location location = (Location) rve.a(transactAndReadException, Location.CREATOR);
                transactAndReadException.recycle();
                return location;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void getLastLocationWithRequest(LastLocationRequest lastLocationRequest, ILocationStatusCallback iLocationStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, lastLocationRequest);
                rve.f(obtainAndWriteInterfaceToken, iLocationStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getLastLocationWithRequest, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void injectLocation(Location location, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, location);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(26, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void injectLocationWithCallback(Location location, int i, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, location);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_injectLocationWithCallback, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void isGoogleLocationAccuracyEnabled(IBooleanStatusCallback iBooleanStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBooleanStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_isGoogleLocationAccuracyEnabled, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void isLocationEnabled(IBooleanStatusCallback iBooleanStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBooleanStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_isLocationEnabled, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void registerDebugListener(IFlpDebugListener iFlpDebugListener, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iFlpDebugListener);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerDebugListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void registerLocationClient(LocationReceiver locationReceiver, LocationRequest locationRequest, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, locationReceiver);
                rve.d(obtainAndWriteInterfaceToken, locationRequest);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerLocationClient, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeActivityTransitionUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeActivityTransitionUpdates, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeActivityUpdates(PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeFloorChangeUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeFloorChangeUpdates, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeGeofenceByRemoveGeofencingRequest(RemoveGeofencingRequest removeGeofencingRequest, IGeofencerCallbacks iGeofencerCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, removeGeofencingRequest);
                rve.f(obtainAndWriteInterfaceToken, iGeofencerCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeGeofenceByRemoveGeofencingRequest, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeGeofences(RemoveGeofencingRequest removeGeofencingRequest, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, removeGeofencingRequest);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeGeofences, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeGeofencesByPendingIntent(PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.f(obtainAndWriteInterfaceToken, iGeofencerCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeGeofencesByRequestIds(String[] strArr, IGeofencerCallbacks iGeofencerCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                rve.f(obtainAndWriteInterfaceToken, iGeofencerCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeLocationUpdates(ILocationListener iLocationListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iLocationListener);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeLocationUpdatesWithPendingIntent(PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeSleepSegmentUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeSleepSegmentUpdates, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, activityTransitionRequest);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestActivityTransitionUpdates, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestActivityUpdates(long j, boolean z, PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestActivityUpdates2(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, activityRecognitionRequest);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestActivityUpdates2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestFloorChangeUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestFloorChangeUpdates, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdates(LocationRequest locationRequest, ILocationListener iLocationListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, locationRequest);
                rve.f(obtainAndWriteInterfaceToken, iLocationListener);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdatesInternal(LocationRequestInternal locationRequestInternal, ILocationListener iLocationListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, locationRequestInternal);
                rve.f(obtainAndWriteInterfaceToken, iLocationListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestLocationUpdatesInternal, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdatesInternalWithPendingIntent(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, locationRequestInternal);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestLocationUpdatesInternalWithPendingIntent, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdatesWithPackage(LocationRequest locationRequest, ILocationListener iLocationListener, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, locationRequest);
                rve.f(obtainAndWriteInterfaceToken, iLocationListener);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdatesWithPendingIntent(LocationRequest locationRequest, PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, locationRequest);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestSleepSegmentUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestSleepSegmentUpdates, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestSleepSegments(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.d(obtainAndWriteInterfaceToken, sleepSegmentRequest);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestSleepSegments, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public boolean setActivityRecognitionMode(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_setActivityRecognitionMode, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setGoogleLocationAccuracyEnabled(SetGoogleLocationAccuracyRequest setGoogleLocationAccuracyRequest, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, setGoogleLocationAccuracyRequest);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(96, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setMockLocation(Location location) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, location);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setMockLocationWithCallback(Location location, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, location);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setMockLocationWithCallback, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setMockMode(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setMockModeWithCallback(boolean z, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setMockModeWithCallback, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void unregisterDebugListener(IFlpDebugListener iFlpDebugListener, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iFlpDebugListener);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_unregisterDebugListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void unregisterLocationClient(LocationReceiver locationReceiver, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, locationReceiver);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_unregisterLocationClient, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void updateDeviceOrientationRequest(DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, deviceOrientationRequestUpdateData);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateDeviceOrientationRequest, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void updateLocationRequest(LocationRequestUpdateData locationRequestUpdateData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, locationRequestUpdateData);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateLocationRequest, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        }

        public static IGoogleLocationManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            return queryLocalInterface instanceof IGoogleLocationManagerService ? (IGoogleLocationManagerService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ArrayList createTypedArrayList = parcel.createTypedArrayList(ParcelableGeofence.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                IGeofencerCallbacks asInterface = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                addGeofence(createTypedArrayList, pendingIntent, asInterface, readString);
                parcel2.writeNoException();
            } else if (i == 2) {
                PendingIntent pendingIntent2 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                IGeofencerCallbacks asInterface2 = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                removeGeofencesByPendingIntent(pendingIntent2, asInterface2, readString2);
                parcel2.writeNoException();
            } else if (i == 3) {
                String[] createStringArray = parcel.createStringArray();
                IGeofencerCallbacks asInterface3 = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                enforceNoDataAvail(parcel);
                removeGeofencesByRequestIds(createStringArray, asInterface3, readString3);
                parcel2.writeNoException();
            } else if (i == 20) {
                LocationRequest locationRequest = (LocationRequest) rve.a(parcel, LocationRequest.CREATOR);
                ILocationListener asInterface4 = ILocationListener.Stub.asInterface(parcel.readStrongBinder());
                String readString4 = parcel.readString();
                enforceNoDataAvail(parcel);
                requestLocationUpdatesWithPackage(locationRequest, asInterface4, readString4);
                parcel2.writeNoException();
            } else if (i == 21) {
                String readString5 = parcel.readString();
                enforceNoDataAvail(parcel);
                Location lastLocationWithPackage = getLastLocationWithPackage(readString5);
                parcel2.writeNoException();
                rve.e(parcel2, lastLocationWithPackage);
            } else if (i == 26) {
                Location location = (Location) rve.a(parcel, Location.CREATOR);
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                injectLocation(location, readInt);
                parcel2.writeNoException();
            } else if (i == 34) {
                String readString6 = parcel.readString();
                enforceNoDataAvail(parcel);
                LocationAvailability lastAvailabilityWithPackage = getLastAvailabilityWithPackage(readString6);
                parcel2.writeNoException();
                rve.e(parcel2, lastAvailabilityWithPackage);
            } else if (i == TRANSACTION_addGeofenceByGeofencingRequest) {
                GeofencingRequest geofencingRequest = (GeofencingRequest) rve.a(parcel, GeofencingRequest.CREATOR);
                PendingIntent pendingIntent3 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                IGeofencerCallbacks asInterface5 = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                addGeofenceByGeofencingRequest(geofencingRequest, pendingIntent3, asInterface5);
                parcel2.writeNoException();
            } else if (i == TRANSACTION_updateLocationRequest) {
                LocationRequestUpdateData locationRequestUpdateData = (LocationRequestUpdateData) rve.a(parcel, LocationRequestUpdateData.CREATOR);
                enforceNoDataAvail(parcel);
                updateLocationRequest(locationRequestUpdateData);
                parcel2.writeNoException();
            } else if (i == TRANSACTION_requestLocationUpdatesInternal) {
                LocationRequestInternal locationRequestInternal = (LocationRequestInternal) rve.a(parcel, LocationRequestInternal.CREATOR);
                ILocationListener asInterface6 = ILocationListener.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                requestLocationUpdatesInternal(locationRequestInternal, asInterface6);
                parcel2.writeNoException();
            } else if (i != TRANSACTION_requestLocationUpdatesInternalWithPendingIntent) {
                switch (i) {
                    case 5:
                        long readLong = parcel.readLong();
                        boolean g = rve.g(parcel);
                        PendingIntent pendingIntent4 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                        enforceNoDataAvail(parcel);
                        requestActivityUpdates(readLong, g, pendingIntent4);
                        parcel2.writeNoException();
                        break;
                    case 6:
                        PendingIntent pendingIntent5 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                        enforceNoDataAvail(parcel);
                        removeActivityUpdates(pendingIntent5);
                        parcel2.writeNoException();
                        break;
                    case 7:
                        Location lastLocation = getLastLocation();
                        parcel2.writeNoException();
                        rve.e(parcel2, lastLocation);
                        break;
                    case 8:
                        LocationRequest locationRequest2 = (LocationRequest) rve.a(parcel, LocationRequest.CREATOR);
                        ILocationListener asInterface7 = ILocationListener.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        requestLocationUpdates(locationRequest2, asInterface7);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        LocationRequest locationRequest3 = (LocationRequest) rve.a(parcel, LocationRequest.CREATOR);
                        PendingIntent pendingIntent6 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                        enforceNoDataAvail(parcel);
                        requestLocationUpdatesWithPendingIntent(locationRequest3, pendingIntent6);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        ILocationListener asInterface8 = ILocationListener.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        removeLocationUpdates(asInterface8);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        PendingIntent pendingIntent7 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                        enforceNoDataAvail(parcel);
                        removeLocationUpdatesWithPendingIntent(pendingIntent7);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        boolean g2 = rve.g(parcel);
                        enforceNoDataAvail(parcel);
                        setMockMode(g2);
                        parcel2.writeNoException();
                        break;
                    case 13:
                        Location location2 = (Location) rve.a(parcel, Location.CREATOR);
                        enforceNoDataAvail(parcel);
                        setMockLocation(location2);
                        parcel2.writeNoException();
                        break;
                    default:
                        switch (i) {
                            case TRANSACTION_checkLocationSettings /* 63 */:
                                LocationSettingsRequest locationSettingsRequest = (LocationSettingsRequest) rve.a(parcel, LocationSettingsRequest.CREATOR);
                                ISettingsCallbacks asInterface9 = ISettingsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                String readString7 = parcel.readString();
                                enforceNoDataAvail(parcel);
                                checkLocationSettings(locationSettingsRequest, asInterface9, readString7);
                                parcel2.writeNoException();
                                break;
                            case 64:
                                String readString8 = parcel.readString();
                                enforceNoDataAvail(parcel);
                                ActivityRecognitionResult lastActivity = getLastActivity(readString8);
                                parcel2.writeNoException();
                                rve.e(parcel2, lastActivity);
                                break;
                            case TRANSACTION_requestFloorChangeUpdates /* 65 */:
                                PendingIntent pendingIntent8 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback asInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                requestFloorChangeUpdates(pendingIntent8, asInterface10);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_removeFloorChangeUpdates /* 66 */:
                                PendingIntent pendingIntent9 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback asInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                removeFloorChangeUpdates(pendingIntent9, asInterface11);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_flushLocations /* 67 */:
                                IFusedLocationProviderCallback asInterface12 = IFusedLocationProviderCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                flushLocations(asInterface12);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_requestSleepSegmentUpdates /* 68 */:
                                PendingIntent pendingIntent10 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback asInterface13 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                requestSleepSegmentUpdates(pendingIntent10, asInterface13);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_removeSleepSegmentUpdates /* 69 */:
                                PendingIntent pendingIntent11 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback asInterface14 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                removeSleepSegmentUpdates(pendingIntent11, asInterface14);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_requestActivityUpdates2 /* 70 */:
                                ActivityRecognitionRequest activityRecognitionRequest = (ActivityRecognitionRequest) rve.a(parcel, ActivityRecognitionRequest.CREATOR);
                                PendingIntent pendingIntent12 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback asInterface15 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                requestActivityUpdates2(activityRecognitionRequest, pendingIntent12, asInterface15);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_flushActivityRecognitionResults /* 71 */:
                                IStatusCallback asInterface16 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                flushActivityRecognitionResults(asInterface16);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_requestActivityTransitionUpdates /* 72 */:
                                ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) rve.a(parcel, ActivityTransitionRequest.CREATOR);
                                PendingIntent pendingIntent13 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback asInterface17 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                requestActivityTransitionUpdates(activityTransitionRequest, pendingIntent13, asInterface17);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_removeActivityTransitionUpdates /* 73 */:
                                PendingIntent pendingIntent14 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                                IStatusCallback asInterface18 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                removeActivityTransitionUpdates(pendingIntent14, asInterface18);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_removeGeofenceByRemoveGeofencingRequest /* 74 */:
                                RemoveGeofencingRequest removeGeofencingRequest = (RemoveGeofencingRequest) rve.a(parcel, RemoveGeofencingRequest.CREATOR);
                                IGeofencerCallbacks asInterface19 = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                removeGeofenceByRemoveGeofencingRequest(removeGeofencingRequest, asInterface19);
                                parcel2.writeNoException();
                                break;
                            case TRANSACTION_updateDeviceOrientationRequest /* 75 */:
                                DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData = (DeviceOrientationRequestUpdateData) rve.a(parcel, DeviceOrientationRequestUpdateData.CREATOR);
                                enforceNoDataAvail(parcel);
                                updateDeviceOrientationRequest(deviceOrientationRequestUpdateData);
                                parcel2.writeNoException();
                                break;
                            default:
                                switch (i) {
                                    case TRANSACTION_setActivityRecognitionMode /* 77 */:
                                        int readInt2 = parcel.readInt();
                                        enforceNoDataAvail(parcel);
                                        boolean activityRecognitionMode = setActivityRecognitionMode(readInt2);
                                        parcel2.writeNoException();
                                        int i3 = rve.a;
                                        parcel2.writeInt(activityRecognitionMode ? 1 : 0);
                                        break;
                                    case TRANSACTION_getActivityRecognitionMode /* 78 */:
                                        int activityRecognitionMode2 = getActivityRecognitionMode();
                                        parcel2.writeNoException();
                                        parcel2.writeInt(activityRecognitionMode2);
                                        break;
                                    case TRANSACTION_requestSleepSegments /* 79 */:
                                        PendingIntent pendingIntent15 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                                        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) rve.a(parcel, SleepSegmentRequest.CREATOR);
                                        IStatusCallback asInterface20 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                        enforceNoDataAvail(parcel);
                                        requestSleepSegments(pendingIntent15, sleepSegmentRequest, asInterface20);
                                        parcel2.writeNoException();
                                        break;
                                    case 80:
                                        String readString9 = parcel.readString();
                                        enforceNoDataAvail(parcel);
                                        Location lastLocationWithAttribution = getLastLocationWithAttribution(readString9);
                                        parcel2.writeNoException();
                                        rve.e(parcel2, lastLocationWithAttribution);
                                        break;
                                    case TRANSACTION_getLastActivityWithFeature /* 81 */:
                                        String readString10 = parcel.readString();
                                        String readString11 = parcel.readString();
                                        enforceNoDataAvail(parcel);
                                        ActivityRecognitionResult lastActivityWithFeature = getLastActivityWithFeature(readString10, readString11);
                                        parcel2.writeNoException();
                                        rve.e(parcel2, lastActivityWithFeature);
                                        break;
                                    case TRANSACTION_getLastLocationWithRequest /* 82 */:
                                        LastLocationRequest lastLocationRequest = (LastLocationRequest) rve.a(parcel, LastLocationRequest.CREATOR);
                                        ILocationStatusCallback asInterface21 = ILocationStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                        enforceNoDataAvail(parcel);
                                        getLastLocationWithRequest(lastLocationRequest, asInterface21);
                                        parcel2.writeNoException();
                                        break;
                                    default:
                                        switch (i) {
                                            case TRANSACTION_setMockModeWithCallback /* 84 */:
                                                boolean g3 = rve.g(parcel);
                                                IStatusCallback asInterface22 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                setMockModeWithCallback(g3, asInterface22);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_setMockLocationWithCallback /* 85 */:
                                                Location location3 = (Location) rve.a(parcel, Location.CREATOR);
                                                IStatusCallback asInterface23 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                setMockLocationWithCallback(location3, asInterface23);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_injectLocationWithCallback /* 86 */:
                                                Location location4 = (Location) rve.a(parcel, Location.CREATOR);
                                                int readInt3 = parcel.readInt();
                                                IStatusCallback asInterface24 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                injectLocationWithCallback(location4, readInt3, asInterface24);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_getCurrentLocation /* 87 */:
                                                CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) rve.a(parcel, CurrentLocationRequest.CREATOR);
                                                ILocationStatusCallback asInterface25 = ILocationStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                ICancelToken currentLocation = getCurrentLocation(currentLocationRequest, asInterface25);
                                                parcel2.writeNoException();
                                                rve.f(parcel2, currentLocation);
                                                break;
                                            case TRANSACTION_registerLocationClient /* 88 */:
                                                LocationReceiver locationReceiver = (LocationReceiver) rve.a(parcel, LocationReceiver.CREATOR);
                                                LocationRequest locationRequest4 = (LocationRequest) rve.a(parcel, LocationRequest.CREATOR);
                                                IStatusCallback asInterface26 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                registerLocationClient(locationReceiver, locationRequest4, asInterface26);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_unregisterLocationClient /* 89 */:
                                                LocationReceiver locationReceiver2 = (LocationReceiver) rve.a(parcel, LocationReceiver.CREATOR);
                                                IStatusCallback asInterface27 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                unregisterLocationClient(locationReceiver2, asInterface27);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_getLastLocationWithCallback /* 90 */:
                                                LastLocationRequest lastLocationRequest2 = (LastLocationRequest) rve.a(parcel, LastLocationRequest.CREATOR);
                                                LocationReceiver locationReceiver3 = (LocationReceiver) rve.a(parcel, LocationReceiver.CREATOR);
                                                enforceNoDataAvail(parcel);
                                                getLastLocationWithCallback(lastLocationRequest2, locationReceiver3);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_getLastAvailability /* 91 */:
                                                LocationAvailabilityRequest locationAvailabilityRequest = (LocationAvailabilityRequest) rve.a(parcel, LocationAvailabilityRequest.CREATOR);
                                                LocationReceiver locationReceiver4 = (LocationReceiver) rve.a(parcel, LocationReceiver.CREATOR);
                                                enforceNoDataAvail(parcel);
                                                getLastAvailability(locationAvailabilityRequest, locationReceiver4);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_getCurrentLocationWithCallback /* 92 */:
                                                CurrentLocationRequest currentLocationRequest2 = (CurrentLocationRequest) rve.a(parcel, CurrentLocationRequest.CREATOR);
                                                LocationReceiver locationReceiver5 = (LocationReceiver) rve.a(parcel, LocationReceiver.CREATOR);
                                                enforceNoDataAvail(parcel);
                                                ICancelToken currentLocationWithCallback = getCurrentLocationWithCallback(currentLocationRequest2, locationReceiver5);
                                                parcel2.writeNoException();
                                                rve.f(parcel2, currentLocationWithCallback);
                                                break;
                                            case TRANSACTION_registerDebugListener /* 93 */:
                                                IFlpDebugListener asInterface28 = IFlpDebugListener.Stub.asInterface(parcel.readStrongBinder());
                                                IStatusCallback asInterface29 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                registerDebugListener(asInterface28, asInterface29);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_unregisterDebugListener /* 94 */:
                                                IFlpDebugListener asInterface30 = IFlpDebugListener.Stub.asInterface(parcel.readStrongBinder());
                                                IStatusCallback asInterface31 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                unregisterDebugListener(asInterface30, asInterface31);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_isGoogleLocationAccuracyEnabled /* 95 */:
                                                IBooleanStatusCallback asInterface32 = IBooleanStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                isGoogleLocationAccuracyEnabled(asInterface32);
                                                parcel2.writeNoException();
                                                break;
                                            case 96:
                                                SetGoogleLocationAccuracyRequest setGoogleLocationAccuracyRequest = (SetGoogleLocationAccuracyRequest) rve.a(parcel, SetGoogleLocationAccuracyRequest.CREATOR);
                                                IStatusCallback asInterface33 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                setGoogleLocationAccuracyEnabled(setGoogleLocationAccuracyRequest, asInterface33);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_addGeofences /* 97 */:
                                                GeofencingRequest geofencingRequest2 = (GeofencingRequest) rve.a(parcel, GeofencingRequest.CREATOR);
                                                PendingIntent pendingIntent16 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                                                IStatusCallback asInterface34 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                addGeofences(geofencingRequest2, pendingIntent16, asInterface34);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_removeGeofences /* 98 */:
                                                RemoveGeofencingRequest removeGeofencingRequest2 = (RemoveGeofencingRequest) rve.a(parcel, RemoveGeofencingRequest.CREATOR);
                                                IStatusCallback asInterface35 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                removeGeofences(removeGeofencingRequest2, asInterface35);
                                                parcel2.writeNoException();
                                                break;
                                            case TRANSACTION_isLocationEnabled /* 99 */:
                                                IBooleanStatusCallback asInterface36 = IBooleanStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                enforceNoDataAvail(parcel);
                                                isLocationEnabled(asInterface36);
                                                parcel2.writeNoException();
                                                break;
                                            default:
                                                return false;
                                        }
                                }
                        }
                }
            } else {
                LocationRequestInternal locationRequestInternal2 = (LocationRequestInternal) rve.a(parcel, LocationRequestInternal.CREATOR);
                PendingIntent pendingIntent17 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                enforceNoDataAvail(parcel);
                requestLocationUpdatesInternalWithPendingIntent(locationRequestInternal2, pendingIntent17);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    @Deprecated
    void addGeofence(List<ParcelableGeofence> list, PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks, String str);

    @Deprecated
    void addGeofenceByGeofencingRequest(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks);

    void addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void checkLocationSettings(LocationSettingsRequest locationSettingsRequest, ISettingsCallbacks iSettingsCallbacks, String str);

    void flushActivityRecognitionResults(IStatusCallback iStatusCallback);

    void flushLocations(IFusedLocationProviderCallback iFusedLocationProviderCallback);

    @Deprecated
    int getActivityRecognitionMode();

    @Deprecated
    ICancelToken getCurrentLocation(CurrentLocationRequest currentLocationRequest, ILocationStatusCallback iLocationStatusCallback);

    ICancelToken getCurrentLocationWithCallback(CurrentLocationRequest currentLocationRequest, LocationReceiver locationReceiver);

    @Deprecated
    ActivityRecognitionResult getLastActivity(String str);

    ActivityRecognitionResult getLastActivityWithFeature(String str, String str2);

    void getLastAvailability(LocationAvailabilityRequest locationAvailabilityRequest, LocationReceiver locationReceiver);

    @Deprecated
    LocationAvailability getLastAvailabilityWithPackage(String str);

    @Deprecated
    Location getLastLocation();

    @Deprecated
    Location getLastLocationWithAttribution(String str);

    void getLastLocationWithCallback(LastLocationRequest lastLocationRequest, LocationReceiver locationReceiver);

    @Deprecated
    Location getLastLocationWithPackage(String str);

    @Deprecated
    void getLastLocationWithRequest(LastLocationRequest lastLocationRequest, ILocationStatusCallback iLocationStatusCallback);

    @Deprecated
    void injectLocation(Location location, int i);

    void injectLocationWithCallback(Location location, int i, IStatusCallback iStatusCallback);

    void isGoogleLocationAccuracyEnabled(IBooleanStatusCallback iBooleanStatusCallback);

    void isLocationEnabled(IBooleanStatusCallback iBooleanStatusCallback);

    void registerDebugListener(IFlpDebugListener iFlpDebugListener, IStatusCallback iStatusCallback);

    void registerLocationClient(LocationReceiver locationReceiver, LocationRequest locationRequest, IStatusCallback iStatusCallback);

    void removeActivityTransitionUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void removeActivityUpdates(PendingIntent pendingIntent);

    @Deprecated
    void removeFloorChangeUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    @Deprecated
    void removeGeofenceByRemoveGeofencingRequest(RemoveGeofencingRequest removeGeofencingRequest, IGeofencerCallbacks iGeofencerCallbacks);

    void removeGeofences(RemoveGeofencingRequest removeGeofencingRequest, IStatusCallback iStatusCallback);

    @Deprecated
    void removeGeofencesByPendingIntent(PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks, String str);

    @Deprecated
    void removeGeofencesByRequestIds(String[] strArr, IGeofencerCallbacks iGeofencerCallbacks, String str);

    @Deprecated
    void removeLocationUpdates(ILocationListener iLocationListener);

    @Deprecated
    void removeLocationUpdatesWithPendingIntent(PendingIntent pendingIntent);

    void removeSleepSegmentUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void requestActivityUpdates(long j, boolean z, PendingIntent pendingIntent);

    void requestActivityUpdates2(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    @Deprecated
    void requestFloorChangeUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    @Deprecated
    void requestLocationUpdates(LocationRequest locationRequest, ILocationListener iLocationListener);

    @Deprecated
    void requestLocationUpdatesInternal(LocationRequestInternal locationRequestInternal, ILocationListener iLocationListener);

    @Deprecated
    void requestLocationUpdatesInternalWithPendingIntent(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent);

    @Deprecated
    void requestLocationUpdatesWithPackage(LocationRequest locationRequest, ILocationListener iLocationListener, String str);

    @Deprecated
    void requestLocationUpdatesWithPendingIntent(LocationRequest locationRequest, PendingIntent pendingIntent);

    void requestSleepSegmentUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void requestSleepSegments(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback);

    @Deprecated
    boolean setActivityRecognitionMode(int i);

    void setGoogleLocationAccuracyEnabled(SetGoogleLocationAccuracyRequest setGoogleLocationAccuracyRequest, IStatusCallback iStatusCallback);

    @Deprecated
    void setMockLocation(Location location);

    void setMockLocationWithCallback(Location location, IStatusCallback iStatusCallback);

    @Deprecated
    void setMockMode(boolean z);

    void setMockModeWithCallback(boolean z, IStatusCallback iStatusCallback);

    void unregisterDebugListener(IFlpDebugListener iFlpDebugListener, IStatusCallback iStatusCallback);

    void unregisterLocationClient(LocationReceiver locationReceiver, IStatusCallback iStatusCallback);

    void updateDeviceOrientationRequest(DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData);

    @Deprecated
    void updateLocationRequest(LocationRequestUpdateData locationRequestUpdateData);
}

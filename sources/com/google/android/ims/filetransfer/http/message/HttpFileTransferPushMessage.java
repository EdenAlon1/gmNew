package com.google.android.ims.filetransfer.http.message;

import android.util.Base64;
import com.google.android.ims.filetransfer.http.message.FileInfo;
import defpackage.dktx;
import defpackage.dkty;
import defpackage.emuz;
import defpackage.emyw;
import defpackage.eyee;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class HttpFileTransferPushMessage implements Serializable {
    private static final long serialVersionUID = -4553689766953957948L;
    public eyee mEncryptedData;
    public String mFileId;
    public FileInfo mFileInfo;
    public String mRemoteInstance;
    public String mSender;
    public FileInfo mThumbnailInfo;

    private HttpFileTransferPushMessage() {
    }

    public static HttpFileTransferPushMessage a(byte[] bArr) {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(new ByteArrayInputStream(bArr), "utf-8");
            newPullParser.nextTag();
            if (!newPullParser.getName().equalsIgnoreCase("file")) {
                throw new IOException("Malformed XML or not a push message for HTTP file transfer. First tag is " + newPullParser.getName());
            }
            HttpFileTransferPushMessage httpFileTransferPushMessage = new HttpFileTransferPushMessage();
            while (newPullParser.getEventType() != 1) {
                newPullParser.next();
                if (FileInfo.e(newPullParser)) {
                    FileInfo a = FileInfo.a(newPullParser);
                    if (a.mType == FileInfo.Type.THUMBNAIL) {
                        httpFileTransferPushMessage.mThumbnailInfo = a;
                    } else if (a.mType == FileInfo.Type.FILE) {
                        httpFileTransferPushMessage.mFileInfo = a;
                    }
                } else if (newPullParser.getEventType() == 2 && emuz.e("encrypted-data", newPullParser.getName())) {
                    httpFileTransferPushMessage.mEncryptedData = eyee.x(Base64.decode(newPullParser.nextText(), 0));
                }
            }
            if (httpFileTransferPushMessage.mFileInfo != null) {
                return httpFileTransferPushMessage;
            }
            throw new IOException("Invalid HTTP file transfer push message. Does not contain file information!");
        } catch (RuntimeException e) {
            dkty.g("RuntimeException: %s", e.getMessage());
            throw new IOException("Unable to parse HTTP file transfer push message", e);
        } catch (XmlPullParserException e2) {
            dkty.g("XmlPullParserException: %s", e2.getMessage());
            throw new IOException("Unable to parse HTTP file transfer push message", e2);
        }
    }

    public final boolean b() {
        return this.mThumbnailInfo != null;
    }

    public final byte[] c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(byteArrayOutputStream, "utf-8");
            newSerializer.setPrefix("", "urn:gsma:params:xml:ns:rcs:rcs:fthttp");
            if (this.mFileInfo.d()) {
                newSerializer.setPrefix("am", "urn:gsma:params:xml:ns:rcs:rcs:rram");
            }
            boolean z = this.mEncryptedData != null;
            if (z) {
                newSerializer.setPrefix("enc", "urn:google:am-ftpush-xml-encryption");
            }
            newSerializer.startDocument("utf-8", false);
            newSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file");
            FileInfo fileInfo = this.mThumbnailInfo;
            if (fileInfo != null) {
                fileInfo.b(newSerializer);
            }
            this.mFileInfo.b(newSerializer);
            if (z) {
                newSerializer.startTag("urn:google:am-ftpush-xml-encryption", "encrypted-data");
                emyw.e(this.mEncryptedData);
                newSerializer.text(Base64.encodeToString(this.mEncryptedData.I(), 0));
                newSerializer.endTag("urn:google:am-ftpush-xml-encryption", "encrypted-data");
            }
            newSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file");
            newSerializer.endDocument();
            newSerializer.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IllegalArgumentException | XmlPullParserException e) {
            throw new IOException(e);
        }
    }

    public final String toString() {
        String c = dktx.USER_ID.c(this.mSender);
        String str = this.mRemoteInstance;
        String str2 = this.mFileId;
        String c2 = dktx.GENERIC.c(this.mThumbnailInfo);
        String c3 = dktx.GENERIC.c(this.mFileInfo);
        eyee eyeeVar = this.mEncryptedData;
        StringBuilder sb = new StringBuilder("Sender: ");
        sb.append(c);
        sb.append("\nRemote Instance: ");
        sb.append(str);
        sb.append("\nFile ID: ");
        sb.append(str2);
        sb.append("\nThumbnail: ");
        sb.append(c2);
        sb.append("\nFile: ");
        sb.append(c3);
        sb.append("\n");
        sb.append(eyeeVar == null ? "No encrypted data" : "Has encrypted data");
        return sb.toString();
    }
}
